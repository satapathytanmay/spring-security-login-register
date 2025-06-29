# Spring Boot Login & Registration with Custom UserDetails

This project demonstrates a complete **Spring Boot** application with **login and registration functionality** using **Spring Security** and **custom user details**.

---

## 🔐 Features

- ✅ User Registration with:
  - Name
  - Username
  - Password
  - Address
  - Phone
- ✅ BCrypt password encoding
- ✅ Login using Spring Security
- ✅ Role-based access (admin/user ready)
- ✅ Custom `UserDetails` implementation
- ✅ Thymeleaf templates for UI
- ✅ Authentication backed by MySQL database

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## 📁 Project Structure

src/
├── main/
│ ├── java/com/sp/main/
│ │ ├── Controller/
│ │ ├── Entity/
│ │ ├── Repository/
│ │ ├── Service/
│ │ ├── SecurityConfig/
│ │ └── SecurityApp.java
│ └── resources/
│ ├── templates/
│ │ ├── register.html
│ │ └── home.html
│ └── application.properties

yaml
Copy
Edit

---

## 🚀 How to Run

### 1️⃣ Clone the repository:
```bash
git clone https://github.com/satapathytanmay/spring-security-login-register.git
cd spring-security-login-register
2️⃣ Configure MySQL in application.properties:
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/security_db
spring.datasource.username=root
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Run the app:
bash
mvn spring-boot:run
4️⃣ Access in your browser:
📄 Registration: http://localhost:8080/register

🔐 Login: http://localhost:8080/login

🏠 Home (after login): http://localhost:8080/

👨‍💻 Author
Satapathy Tanmay
Java Full Stack Developer | Spring Boot Enthusiast
🔗 GitHub
---
```bash
git add README.md
git commit -m "Cleaned up README for GitHub"
git push
