<div align="center">

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=700&size=32&duration=3000&pause=1000&color=00B4D8&center=true&vCenter=true&width=600&lines=UrbanStay+%F0%9F%8F%A8;AI-Powered+Hotel+Management;Smart+%C2%B7+Scalable+%C2%B7+Intelligent" alt="Typing SVG" />

<br/>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Under%20Development-orange?style=for-the-badge&logo=github" />
  <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/PostgreSQL-16-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20AI-Integrated-FF6B6B?style=for-the-badge&logo=spring&logoColor=white" />
</p>

<p align="center">
  <strong>An intelligent hotel management & booking platform powered by Spring Boot and Spring AI.</strong><br/>
  Built from scratch as a real-world learning project — going beyond tutorials to build production-style backend architecture.
</p>

</div>

---

## 🌟 What is UrbanStay?

**UrbanStay** is not just another hotel booking system — it's an **intelligent hotel automation platform** that leverages AI to deliver smarter booking experiences, personalized recommendations, occupancy predictions, and automated customer support.

> 🚀 *Started on Day 5 of learning Spring Boot. Built by actually building — not just following docs.*

---

## ✨ Core Features

<table>
<tr>
<td width="50%">

### 🏗️ Hotel Management
- ✅ User Authentication & Authorization
- ✅ Role-Based Access Control (RBAC)
- ✅ Hotel & Room Management
- ✅ Booking System with Status Tracking
- ✅ Guest Management
- ✅ Inventory Management
- ✅ Payment Management
- ✅ Amenities & Media Handling

</td>
<td width="50%">

### 🤖 AI Features *(Planned — Spring AI)*
- 🔮 Smart Hotel Recommendations
- 💬 AI Booking Assistant (Natural Language)
- 🗺️ Personalized Stay Suggestions
- 🔍 Natural Language Hotel Search
- 🎧 AI Customer Support Chatbot
- 📊 Occupancy & Inventory Prediction

</td>
</tr>
</table>

---

## 🤖 AI Capabilities in Detail

### 1. 🏨 Smart Hotel Recommendations
AI-based recommendation engine that suggests hotels and rooms based on:
- User preferences & booking history
- Budget, location, ratings & popularity

### 2. 💬 AI Booking Assistant
An intelligent assistant that helps users find rooms, book hotels, modify reservations, and get pricing — all using **natural language**.

> *Example: "Book me a deluxe room in Goa for 2 nights under ₹5000."*

### 3. 🗺️ Personalized Stay Suggestions
- Nearby attractions & food recommendations
- Best room types for the season
- Seasonal travel insights

### 4. 🔍 Natural Language Hotel Search
> *Example: "Find a luxury hotel near the beach with free WiFi and pool."*

### 5. 🎧 AI Customer Support Chatbot
Automated 24/7 support for booking queries, cancellations, hotel details, and guest assistance.

### 6. 📈 Occupancy & Inventory Prediction
- Demand forecasting
- Dynamic room availability management
- Pricing optimization insights

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| **Language** | Java 17+ |
| **Framework** | Spring Boot 3.x |
| **ORM** | Spring Data JPA + Hibernate |
| **Security** | Spring Security |
| **AI** | Spring AI |
| **Database** | PostgreSQL |
| **Build Tool** | Maven |
| **Utilities** | Lombok, Postman |

---

## 🗄️ Database Design

### Entities

| Entity | Description |
|--------|-------------|
| `AppUser` | Registered platform users |
| `UserRoles` | Role assignments (RBAC) |
| `Hotel` | Hotel listings with contact info, amenities, photos |
| `Room` | Rooms under a hotel with pricing and capacity |
| `Booking` | Booking records linking users, rooms, and payments |
| `Guest` | Guest profiles associated with bookings |
| `BookingGuest` | Many-to-many join between Booking and Guest |
| `Inventory` | Daily room availability and surge pricing |
| `Payment` | Payment records with transaction tracking |

### Entity Relationships

```
AppUser      ──< Booking         (One user → Many bookings)
Hotel        ──< Room            (One hotel → Many rooms)
Hotel        ──< Inventory       (One hotel → Many inventory records)
Booking      ──  Payment         (One booking → One payment)
Booking     >──< Guest           (Many-to-many via BookingGuest)
Room         ──< Inventory       (One room → Many inventory slots)
```

### ERD Preview

> See the full ERD in the `/docs` folder or the DB schema screenshots.

---

## 🚀 Getting Started

### Prerequisites
- Java 17+
- PostgreSQL 14+
- Maven 3.8+

### Setup

```bash
# 1. Clone the repository
git clone https://github.com/your-username/urbanstay.git
cd urbanstay

# 2. Configure your database
# Edit src/main/resources/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/urbanstay
spring.datasource.username=your_username
spring.datasource.password=your_password

# 3. Run the application
mvn spring-boot:run
```

---

## 🗺️ Roadmap

- [x] Core entity design & database schema
- [x] User authentication & RBAC
- [x] Hotel, Room, Booking, Payment modules
- [x] Inventory & Guest management
- [ ] Spring AI integration — recommendations engine
- [ ] AI booking assistant (natural language)
- [ ] AI customer support chatbot
- [ ] Occupancy prediction model
- [ ] Redis caching layer
- [ ] Kafka event streaming
- [ ] Docker & Kubernetes deployment
- [ ] Admin analytics dashboard
- [ ] Payment gateway integration
- [ ] Email & notification service
- [ ] Microservices architecture migration
- [ ] AI Voice Assistant

---

## 📁 Project Structure

```
urbanstay/
├── src/
│   └── main/
│       ├── java/com/urbanstay/
│       │   ├── config/          # Security, AI config
│       │   ├── controller/      # REST controllers
│       │   ├── dto/             # Data transfer objects
│       │   ├── entity/          # JPA entities
│       │   ├── repository/      # Spring Data repositories
│       │   ├── service/         # Business logic
│       │   └── ai/              # Spring AI integrations
│       └── resources/
│           └── application.properties
└── pom.xml
```

---

## 🧠 Learning Journey

> This project began on **Day 5 of learning Spring Boot** — built as a deliberate alternative to following tutorials passively.

The goal: understand scalable backend architecture, Spring ecosystem depth, and AI integration — all at once, through the lens of a real-world application.

**What I'm learning through UrbanStay:**
- Spring Boot project architecture at scale
- JPA/Hibernate relationships & query optimization
- Spring Security with JWT/role-based access
- Spring AI for GenAI integration
- PostgreSQL schema design & normalization
- REST API design best practices

---

## 👤 Author

**Hitansh**
*Backend Developer | Java & Spring Boot Enthusiast | Exploring AI Integration*

<p>
  <a href="https://github.com/your-username"><img src="https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github" /></a>
  <a href="https://linkedin.com/in/your-profile"><img src="https://img.shields.io/badge/LinkedIn-Connect-0A66C2?style=for-the-badge&logo=linkedin" /></a>
</p>

---

<div align="center">
  <sub>🚧 <strong>Status: Actively under development</strong> — core backend modules and AI integration in progress.</sub><br/><br/>
  <sub>If you find this project interesting, consider giving it a ⭐ — it keeps the motivation going!</sub>
</div>
