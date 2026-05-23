package com.UrbanStay.HotelBooking.advice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class GlobalResponseHandler implements ResponseBodyAdvice<Object> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        // Apply to all controller responses
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        // If body is already ApiResponse or ApiError, return as-is
        if (body instanceof ApiResponse || body instanceof ApiError) {
            return body;
        }

        // If controller returns a plain String, we must return a JSON string (message) because
        // StringHttpMessageConverter expects a String. Convert ApiResponse into JSON string.
        if (returnType.getParameterType() == String.class) {
            ApiResponse<String> apiResponse = ApiResponse.success(body == null ? null : body.toString());
            try {
                response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
                return objectMapper.writeValueAsString(apiResponse);
            } catch (JsonProcessingException e) {
                log.error("Failed to convert ApiResponse to JSON string", e);
                // fallback to plain string message
                return apiResponse.getMessage();
            }
        }

        // Wrap normal responses
        return ApiResponse.success(body);
    }
}

