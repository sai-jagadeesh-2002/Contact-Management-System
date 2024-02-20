# Contact-Management-System

# Online Contact Management System Backend 
This project is a backend implementation of an Online Contact Management System using Java Spring Boot with H2 Database for data storage. It provides RESTful endpoints for managing user contacts.
 
## Features
- CRUD operations for managing user contacts: create, read, update, delete
- Logging of controller method responses using Aspect-Oriented Programming (AOP)
- Data storage using H2 Database
- RESTful API endpoints:
  - POST /api/v1/contacts - Add contact
  - GET /api/v1/contacts/{id} - Get details about a contact
  - PUT /api/v1/contacts/{id} - Update a contact
  - DELETE /api/v1/contacts/{id} - Delete a contact
 
  
## Logging
The application logs responses from controller methods using Aspect-Oriented Programming (AOP). You can view the log messages in the console or log file.
 
## Database
The application uses H2 Database for data storage. You can access the H2 console at `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`, Username: `sa`, Password: leave empty).
