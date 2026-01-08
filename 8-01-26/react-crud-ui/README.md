# Day 8 – React CRUD UI with Spring Boot & MongoDB

## 📌 Overview
This project is a **React-based frontend** built using **Vite + React** that connects to a **Spring Boot MongoDB CRUD API** developed earlier (Day 6).

The UI provides a clean, user-friendly dashboard with buttons to perform:
- Create
- Read
- Update
- Delete

All operations are reflected **in real-time** in MongoDB.

---

## 🛠 Tech Stack
- **Frontend:** React (Vite)
- **Backend:** Spring Boot
- **Database:** MongoDB
- **HTTP Client:** Axios
- **Styling:** CSS (Gradient UI)

---

### How to Run (Complete Flow)
Start MongoDB (Local) : mongod or ensure MongoDB service is running on port 27017.

Start Backend pushed on 6-01-26
cd 6-01-26/mongo-crud
./gradlew bootRun


Backend runs at: http://localhost:8080

Start Frontend

cd 8-01-26/react-crud-ui
npm install
npm run dev


Frontend runs at: http://localhost:5174

