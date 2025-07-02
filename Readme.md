# EDUBLOG Frontend

A modern, responsive blogging platform frontend built with React, designed specifically for educational content sharing and learning management.

## 🚀 Features

- Modern and responsive user interface
- Rich text editing with Quill editor
- Markdown support for content creation
- User authentication and authorization
- Blog post creation, editing, and management
- Educational content organization
- Responsive design for all devices

## 🛠️ Tech Stack

- **React.js** - Frontend library
- **React Router** - Navigation and routing
- **Axios** - HTTP client for API requests
- **TailwindCSS** - Utility-first CSS framework
- **Quill** - Rich text editor
- **Marked** - Markdown parsing
- **TurnDown** - HTML to Markdown conversion

## 📋 Prerequisites

Before running this project, make sure you have:

- Node.js (v14 or higher)
- npm (v6 or higher)
- Git

## 🔧 Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/edublog-frontend.git
cd edublog-frontend
```

2. Install dependencies:
```bash
npm install
```

3. Create a `.env` file in the root directory and add necessary environment variables:
```env
REACT_APP_API_URL=your_backend_api_url
```

4. Start the development server:
```bash
npm start
```

The application will be available at `http://localhost:3000`

## 🏗️ Project Structure

```
edublog-frontend/
├── public/             # Static files
├── src/               # Source code
│   ├── components/    # Reusable components
│   ├── pages/        # Page components
│   ├── services/     # API services
│   ├── utils/        # Utility functions
│   └── App.js        # Main application component
├── package.json      # Project dependencies and scripts
└── tailwind.config.js # Tailwind CSS configuration
```

## 🚀 Available Scripts

- `npm start` - Runs the app in development mode
- `npm test` - Launches the test runner
- `npm run build` - Builds the app for production
- `npm run eject` - Ejects from Create React App

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.


## 👥 Authors
- SHATAKSHI PALLI
- ACHA SRIDATTA VARMA
- MEGHANA BAJJURI
- MOHAMMED ABBU HUZAIFA

## 🙏 Acknowledgments

- Create React App team
- TailwindCSS team
- All contributors and supporters

---

# EDUBLOG Backend

A modern, scalable backend for the EduBlog platform, built with Java and Spring Boot.

---

## 🚀 Features
- RESTful API endpoints for content management
- User authentication and authorization
- Scalable architecture ready for deployment
- Robust data handling and business logic

## 🛠️ Tech Stack
- **Java** – Core programming language
- **Spring Boot** – Application framework
- **Maven** – Dependency management and build tool
- **JPA/Hibernate** – Database persistence (Assumed)
- **MySQL/PostgreSQL** – Relational database (Assumed)

## 📋 Prerequisites
Before running this project, make sure you have:
- JDK 11 or higher
- Maven 3.2 or higher
- Git

## 🔧 Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/ShatakshiPalli/MiniProject_Backend.git
   cd MiniProject_Backend
   ```
2. **Build the project:**
    This command compiles the source code and packages it into a `.jar` file.
   ```bash
   mvn clean install
   ```
3. **Configure the application:**
   Open `src/main/resources/application.properties` and update the database connection details and other environment-specific settings.
   
4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
   The backend API will be available at `http://localhost:8080` (or the configured port).

## 🏗️ Project Structure
```
MiniProject_Backend/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/edublog/          # Source code
│   │   │   ├── config/                # Spring configuration
│   │   │   ├── controller/            # API controllers
│   │   │   ├── model/                 # Data models (Entities)
│   │   │   ├── repository/            # Data repositories
│   │   │   └── service/               # Business logic
│   │   └── resources/                 # Application properties, static assets
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml                            # Project dependencies and plugins
```

## 🚀 Available Scripts
- `mvn clean install` – Compiles, tests, and packages the application.
- `mvn spring-boot:run` – Runs the application using the Spring Boot Maven plugin.
- `mvn test` – Runs the unit tests for the project.

## 🤝 Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License
This project is licensed under the MIT License.

## 👥 Authors
- SHATAKSHI PALLI
- ACHA SRIDATTA VARMA
- MEGHANA BAJJURI
- MOHAMMED ABBU HUZAIFA

## 🙏 Acknowledgments
- Spring Boot team
- Maven community
- All contributors and supporters

---
