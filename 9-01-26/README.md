# Day 9 – Kafka with Zookeeper (Producer–Consumer using Spring Boot)

## Objective
To implement Apache Kafka (Zookeeper-based) using Docker and connect two Spring Boot applications:
- **Producer**: MongoDB CRUD API (User Service)
- **Consumer**: Student Management API

Kafka is used to send events from the Producer to the Consumer asynchronously.

---

## Architecture
User API (Producer)  
→ Kafka Topic (`user-events`)  
→ Student API (Consumer)  

Kafka and Zookeeper are run using Docker containers.

---

## 🛠️ Tech Stack
- Java 21
- Spring Boot
- Spring Kafka
- Apache Kafka (Zookeeper-based)
- Docker & Docker Compose
- MongoDB
- Swagger UI

---

## 📂 Project Structure

9-01-26/
│
├── kafka-docker/
│ └── docker-compose.yml
│
├── mongo-producer/
│ └── Spring Boot Mongo CRUD + Kafka Producer
│
├── student-consumer/
│ └── Spring Boot CRUD + Kafka Consumer
│
└── README.md


### Instructions to run 

1️⃣ Start Kafka & Zookeeper (Docker)

    cd 9-01-26/kafka-docker
    docker compose up -d
    docker ps

2️⃣ Create Kafka Topic
    docker exec -it kafka kafka-topics --create \
    --topic user-events \
    --bootstrap-server localhost:9092 \
    --partitions 1 \
    --replication-factor 1

3️⃣ Start MongoDB (Local or Docker)

    Ensure MongoDB is running on:  mongodb://localhost:27017


4️⃣ Start Producer Application

    cd 9-01-26/mongo-producer
    ./gradlew bootRun

5️⃣ Start Consumer Application

    cd 9-01-26/student-consumer
    ./gradlew bootRun

6️⃣ Verify Kafka Message Flow (Console Consumer)

    docker exec -it kafka kafka-console-consumer \
    --topic user-events \
    --bootstrap-server localhost:9092 \
    --from-beginning

7️⃣ Test End-to-End Flow

    Open Swagger (Producer)

    Call: POST /api/users


    Payload:

        {
        "name": "Kafka Test User",
        "email": "kafka@test.com"
        }