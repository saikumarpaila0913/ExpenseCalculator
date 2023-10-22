# Expense Tracking Project

## Overview
The "Expense Tracking" project is a Java-based application that models User-related data, including , expenses, users, and tokens. It provides a structured representation of this data and allows for relationships between entities. This README provides an overview of the project's structure and components.

## Frameworks and Technologies Used
- **Language:** Java
- **Data Modeling:** Java Persistence API (JPA)
- **Database:** MYSQL 
- **Validation:** Java Bean Validation (JSR 380)
- **API:** RESTful
- **Server:** AWS

## Data Flow
The data flow within the project is organized into several components:

### 1. Controller
- Responsible for handling incoming HTTP requests.
- Validates input data using Java Bean Validation.
- Routes requests to appropriate service methods.
- Provides endpoints for managing user and expense-related entities.
- in this package has controller class of all entities.  

### 2. Services
- Implements business logic and data validation.
- Communicates with the repositories (Repo) to perform CRUD operations.
- Manages exceptions and error handling.
- Contains methods for adding, updating, deleting, and retrieving student-related entities.
- in this package has service class of all entities. 

### 3. Repo (Repository)
- Extends Java Persistence API (JPA) repositories.
- Offers database access methods for Expenses-related entities.
- Supports standard CRUD operations (Create, Read, Update, Delete).
- Manages relationships between entities.

### 4. Datasource
- Configures the MYSQL .
- Specifies database properties such as URL, username, and password.
- Handles data initialization.

## Data Structures
The project primarily uses the following data structures:
- **Entities:** User, expense, AuthenticationToken and  various aspects of User data.
- **In-memory H2 Database Tables:** Store and manage data during runtime.
- **Relationships:** One-to-One, One-to-Many, Many-to-Many,Many-to-One relationships are established between entities to represent real-world connections.

## Project Summary
The "Expense Tracking" project is designed to model and manage student-related data efficiently. It leverages Java, JPA, and an AWS MYSQL database for data modeling and storage. The codebase adheres to best practices for maintainable and scalable applications, with clear separation of concerns between controllers, services, and repositories. This project is well-suited for modeling and managing expenses data in educational contexts.
