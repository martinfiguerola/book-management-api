# Book Management API 📚

A RESTful API for managing books, developed as part of my backend learning journey with **Spring Boot**.

## 🚀 Project Description

This project provides a basic book management system that allows CRUD operations (create, read, update, delete) on a catalog. It serves as a practical exercise to apply fundamental backend development concepts using the **Spring Boot** framework.

### Key Features:
- **Create Books:** Add a new book to the system with details such as title, author, publication year, and price.
- **List Books:** Retrieve all stored books or search for one by its ID.
- **Update Books:** Modify existing book information.
- **Delete Books:** Remove a book from the system.

---

## 🛠️ Technologies and Tools

- **Language:** Java 17+
- **Framework:** Spring Boot
- **Key Dependencies:**
  - Spring Web
  - Spring Data JPA
  - MySQL database for development/test
  - Lombok to reduce boilerplate code

---

## 📋 Prerequisites

Before running the application, ensure you have the following installed:

- Java 17 or higher
- Maven 3.8 or higher

---

## 🔧 Project Setup

Follow these steps to run the application locally:

1. Clone this repository:
   ```bash
   git clone https://github.com/martinfiguerola/book-management-api.git
   cd book-management-api
   ```

2. Build the project with Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the application at:
   ```
   http://localhost:8080
   ```

---

## 📚 API Endpoints

| Method   | Endpoint              | Description                                 |
|----------|-----------------------|---------------------------------------------|
| `POST`   | `/books`              | Create a new book                          |
| `GET`    | `/books`              | List all books                             |
| `GET`    | `/books/{id}`         | Get a book by ID                           |
| `PUT`    | `/books/{id}`         | Update an existing book                    |
| `DELETE` | `/books/{id}`         | Delete a book by ID                        |

### Example Request for `POST /books`:
```json
{
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "publicationYear": "1925",
  "price": 10.99
}
```

---

## 🎯 What I Learned

In this project, I developed key backend skills such as:
- Setting up a Spring Boot project from scratch.
- Using annotations like `@RestController`, `@Service`, and `@Repository` to follow the **MVC** pattern.
- Managing data with **Spring Data JPA** and querying a MySQL database.

---

## 🖋️ Contributing

If you'd like to contribute to this project, please open an issue or submit a pull request. All contributions are welcome.

---
