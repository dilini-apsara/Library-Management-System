# Book Store Application

This is a full-stack Book Store application built using Angular for the front end and Spring Boot for the back end. The application allows users to manage a list of books and perform CRUD operations (Create, Read, Update, Delete). It features form validation, routing, and API integration.

## Features

- **Front End**: Angular, Bootstrap, ngForms, Template-driven form validation
- **Back End**: Spring Boot, Spring Data JPA, H2 Database, ModelMapper
- **Database**: H2 in-memory database
- **API Testing**: Postman
- **Routing**: Angular Routers for navigation
- **Full-Stack Integration**: The front-end application consumes APIs exposed by the back-end.

---

## Technologies Used

### Front End
- **Angular**: Framework for building dynamic web applications.
- **Bootstrap**: CSS framework for responsive design.
- **ngForms**: Angular forms for handling form inputs and validations.
- **Template-Driven Validation**: Form validation based on Angular templates.
- **Routing**: Angular Router for navigating between pages.

### Back End
- **Spring Boot**: Java-based framework for building RESTful APIs.
- **Spring Data JPA**: For data persistence and CRUD operations.
- **H2 Database**: In-memory database for easy development and testing.
- **ModelMapper**: For object mapping between DTOs and entities.
- **Postman**: Tool for testing API endpoints.

---

## Getting Started

### Prerequisites

To run this application locally, you need the following installed:
- **Node.js** (for Angular)
- **Java** (for Spring Boot)
- **Maven** (for building the Spring Boot app)


### API Endpoints
The back end exposes the following API endpoints for managing books:

**GET /api/v1/bookstore** : Fetch all books
**GET /api/v1/bookstore/{id}**: Fetch a book by ID
**POST /api/v1/bookstore** : Add a new book
**PATCH /api/v1/bookstore/{id}** : Update a book
**DELETE /api/v1/bookstore/{id}** : Delete a book
You can test these endpoints using Postman.

