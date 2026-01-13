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


