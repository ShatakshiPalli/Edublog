# 🧠 EduBlog – Educational Blogging Platform

**EduBlog** is a modern, full-stack blogging platform built for educational content sharing and learning management. It features a responsive user interface, rich-text and markdown editing, authentication, and scalable backend APIs.

> 🔗 **Live Demo:** [https://edublog-front-deploy.vercel.app/](https://edublog-front-deploy.vercel.app/)

---

## 📁 Repositories

- **Frontend Repo:** [ShatakshiPalli/EduBlog_frontend](https://github.com/ShatakshiPalli/EduBlog_frontend)
- **Backend Repo:** [ShatakshiPalli/MiniProject_Backend](https://github.com/ShatakshiPalli/MiniProject_Backend)

---

## 🚀 Features

- ✅ Modern and responsive UI with Tailwind CSS
- ✍️ Rich text editing (Quill) & Markdown support
- 🔐 User authentication and role-based authorization
- 📝 Blog creation, editing, deletion, and viewing
- 📁 Organized educational content
- 📱 Mobile-first responsive design
- 🛠️ RESTful backend APIs with Spring Boot

---

## 🛠️ Tech Stack

### 🔹 Frontend
- **React.js** – Component-based frontend library
- **React Router** – Navigation and routing
- **Axios** – API request handling
- **TailwindCSS** – Utility-first CSS framework
- **Quill** – Rich text editor
- **Marked & Turndown** – Markdown parsing and HTML conversion

### 🔹 Backend
- **Java 11** – Core backend language
- **Spring Boot** – Backend framework
- **Maven** – Build and dependency management
- **JPA/Hibernate** – ORM for data persistence
- **MySQL/PostgreSQL** – Relational database (configurable)

---

## 📋 Prerequisites

Make sure you have the following installed:

- **Node.js** (v14+)
- **npm** (v6+)
- **JDK 11** or higher
- **Maven 3.2+**
- **Git**

---

## 🔧 Installation

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/ShatakshiPalli/EduBlog.git
cd EduBlog
```

---

### 2️⃣ Frontend Setup

```bash
cd EduBlog_frontend
npm install
```

> Create a `.env` file in `frontend/`:
```
REACT_APP_API_URL=http://localhost:8080
```

```bash
npm start
```

The frontend will be available at: `http://localhost:3000`

---

### 3️⃣ Backend Setup

```bash
cd Backend
mvn clean install
```

> Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/edublog
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

```bash
mvn spring-boot:run
```

The backend API will run at: `http://localhost:8080`

---

## 🏗️ Project Structure

```
EduBlog_frontend/
├── frontend/               # React frontend
│   ├── src/
│   ├── public/
│   └── .env
├── Backend/                # Spring Boot backend
│   ├── src/
│   │   ├── main/java/com/edublog/
│   │   └── resources/
│   └── pom.xml
└── README.md               # Project documentation
```

---

## 🚀 Available Scripts

### Frontend
- `npm start` – Start development server
- `npm test` – Run tests
- `npm run build` – Build for production

### Backend
- `mvn spring-boot:run` – Start the Spring Boot application
- `mvn test` – Run unit tests
- `mvn clean install` – Build the project

---

## 🤝 Contributing

1. Fork the repo
2. Create your branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add AmazingFeature'`)
4. Push the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📝 License

This project is licensed under the **MIT License** – see the `LICENSE` file for details.

---

## 👥 Authors

- **Shatakshi Palli**
- **Acha Sridatta Varma**
- **Meghana Bajjuri**
- **Mohammed Abbu Huzaifa**

---

## 🙏 Acknowledgments

- [Create React App](https://create-react-app.dev/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Tailwind CSS](https://tailwindcss.com/)
- [React Quill](https://github.com/zenoamaro/react-quill)
- All contributors and supporters 💙
