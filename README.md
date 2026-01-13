# student_Management_System
Student Management System
# 🎓 Student Management System (JDBC)

A **console-based Student Management System** built using **Core Java + JDBC + MySQL**.  
This project performs full **CRUD operations** (Create, Read, Update, Delete) on student records.

---

## ✅ Features
- ➕ Add Student
- 📄 View All Students
- ✏️ Update Student Details
- 🗑️ Delete Student
- 📌 Menu-driven console UI

---

## 🛠️ Tech Stack
- **Java (JDK 17)**
- **JDBC**
- **MySQL**
- **Eclipse IDE**
- **Git & GitHub**

---

## 📂 Project Structure
student_Management_System/
│
├── src/
│ ├── model/ # Student Model class
│ ├── util/ # DB Connection utility
│ ├── dao/ # DAO Interface & Implementation
│ └── main/ # Main application (console UI)
│
└── .gitignore




---

## 🗄️ Database Setup (MySQL)

### 1. Create Database
```sql
CREATE DATABASE `school-db`;
USE `school-db`;



2️⃣ Create Table
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50),
    age INT
);

⚙️ Configuration
public static final String url = "jdbc:mysql://localhost:3306/school-db";
public static final String username = "root";
public static final String password = "YOUR_PASSWORD";


▶️ How to Run the Project

1. Clone this repository

2. Import the project into Eclipse IDE

3. Add MySQL Connector/J (JAR file) to Build Path

4. Run the Main.java file from main package


📌 Learning Outcomes

JDBC Connection setup

PreparedStatement usage

ResultSet handling

DAO Design Pattern

CRUD operations with MySQL

🚀Future Improvements

Search student by name/email

Validation (email format, age limit)

Use .properties file for DB config

Convert into Servlet-based Web App


👨‍💻 Author

Nitik Kumar Sahay

<img width="1066" height="838" alt="image" src="https://github.com/user-attachments/assets/8c2520f0-6378-4dd0-b31a-bb0d7fed5247" />

<img width="817" height="831" alt="image" src="https://github.com/user-attachments/assets/e9f85b9b-ac84-4b54-a84c-f86740075a09" />

<img width="1005" height="822" alt="image" src="https://github.com/user-attachments/assets/5e874ee6-e18b-4a8c-8f4f-9f65a11a96f8" />

<img width="1657" height="847" alt="image" src="https://github.com/user-attachments/assets/6cf7288a-f4e8-4481-ae1e-de6d547e89a6" />




