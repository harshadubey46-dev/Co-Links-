# 🐦 Co-Links Backend

A **Spring Boot REST API** for a campus-focused microblogging platform where students can connect, share updates, discover classmates, and interact within their college community.

Co-Links is inspired by Twitter/X but designed specifically for universities and students.

---

## 🚀 Features

### 👤 Student Authentication
- Student Registration
- Login System
- College Email Verification
- User Profile Management

### 🎓 Student Profiles
Students can add:
- Name
- Course
- Academic Year
- Skills
- Bio

Helps students discover classmates with similar interests.

---

### 📝 Tweet Management

Users can:

✔ Create Tweets  
✔ View Campus Feed  
✔ Update Tweets  
✔ Delete Tweets  
✔ Like Tweets  

Complete CRUD functionality implemented.

---

### 🔍 Student Discovery

Search students based on username.

Useful for finding:

- Developers
- Project partners
- Hackathon teammates
- Seniors/Juniors

---

## 🛠 Tech Stack

| Technology | Usage |
|----------|--------|
| Java | Backend Programming |
| Spring Boot | REST API Development |
| Spring Data JPA | Database Operations |
| Hibernate | ORM |
| H2 Database | Database |
| Maven | Dependency Management |
| Eclipse IDE | Development |

---

## 📂 Project Structure

```text
Co-Links

src/main/java/com/campustweet

│
├── controller
│
│   ├── UserController.java
│   └── TweetController.java
│
├── model
│
│   ├── User.java
│   └── Tweet.java
│
├── repository
│
│   ├── UserRepository.java
│   └── TweetRepository.java
│
└── CampusTweetApplication.java
```

---

## 🌐 API Endpoints


### 👤 User APIs

| Method | Endpoint | Description |
|------|----------|-------------|
| POST | `/api/users/register` | Register student |
| POST | `/api/users/login` | Login user |
| GET | `/api/users/search/{keyword}` | Search students |


---

### 🐦 Tweet APIs


| Method | Endpoint | Description |
|------|----------|-------------|
| GET | `/api/tweets` | Get all tweets |
| POST | `/api/tweets` | Create tweet |
| PUT | `/api/tweets/{id}` | Update tweet |
| PUT | `/api/tweets/{id}/like` | Like tweet |
| DELETE | `/api/tweets/{id}` | Delete tweet |

---

## 🗄 Database

The project uses H2 Database.

Access console:

```url
http://localhost:8081/h2-console
```

Configuration:

```properties
JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: 
```

---

## ▶️ How To Run

Clone repository:

```bash
git clone https://github.com/your-username/CampusTweet.git
```

Move into project:

```bash
cd CampusTweet
```

Run:

```bash
mvn spring-boot:run
```

Server starts:

```text
http://localhost:8081
```

---

## 📌 Future Enhancements

- Follow/Unfollow students
- Comments on tweets
- Image Uploads
- Notifications
- Real-time Chat
- Placement & Event Channels

---

## 💡 Project Idea

Traditional social media platforms connect people globally, but students often need a dedicated space for campus communication.

Co-Links focuses on:

🎓 Academic Networking  
💻 Project Collaboration  
🚀 Hackathon Connections  
📢 Campus Updates  

---

## 👩‍💻 Developed By

**Harsha Dubey**
**Awantika Choudhari**
**Shreyanshi Rahandale**

MCA Students  

---

⭐ If you like this project, don't forget to star the repository!
