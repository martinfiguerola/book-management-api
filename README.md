# Book Management API

## Assignment: Development of a Book Management API

**Role**: You are a backend developer tasked with creating a REST API for the book management system of our fictitious institution: **Universal Library**. The goal is to develop a simple, efficient, and well-documented API using **Spring Boot**, **Spring Data JPA**, and **MySQL**.

**Scope of the Project**: The API should manage a catalog of books with basic CRUD operations. It should not include relationships between entities or additional features like authentication or security.

---

## Project Requirements

### 1. Mandatory Features
Your API must support the following operations:

1. **Add a New Book**
    - **Endpoint:** `POST /api/books`
    - **Description:** Allow users to add books to the catalog.
    - **Required Book Fields:**
        - `id` (auto-generated)
        - `title` (maximum 255 characters)
        - `author` (maximum 255 characters)
        - `publicationYear` (integer)
        - `price` (decimal number)

2. **Retrieve All Books**
    - **Endpoint:** `GET /api/books`
    - **Description:** Returns a list of all registered books.

3. **Retrieve a Book by ID**
    - **Endpoint:** `GET /api/books/{id}`
    - **Description:** Returns details of a specific book by its `id`.

4. **Update Book Details**
    - **Endpoint:** `PUT /api/books/{id}`
    - **Description:** Allows updating the data of a specific book.

5. **Delete a Book**
    - **Endpoint:** `DELETE /api/books/{id}`
    - **Description:** Deletes a specific book from the catalog.

---

### 2. Technical Requirements
- Use **Spring Boot** for the API's architecture.
- Mandatory connection to a **MySQL** database.
- Implement operations using **Spring Data JPA**, leveraging a standard repository (`JpaRepository`).
- Do not use relationships between tables.
- Provide a detailed `README.md` file, including:
    - Instructions for setting up the database and running the application.
    - Examples of typical requests and responses for each endpoint.

---

## Technical Details

### Book Model (`Book`)
The model should have the following attributes:
- **id**: Primary key, auto-generated (`Long`)
- **title**: Book title (`String`)
- **author**: Book author (`String`)
- **publicationYear**: Year of publication (`int`)
- **price**: Book price (`double`)

### MySQL Database
- **Database name:** `library_db`
- **Table:** `books`

**Suggested schema for the table:**
```sql
CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    publication_year INT NOT NULL,
    price DOUBLE NOT NULL
);
