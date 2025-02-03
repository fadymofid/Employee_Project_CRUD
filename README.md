# Employee CRUD Project

This project is a **CRUD (Create, Read, Update, Delete) Employee Management System**, implemented in three different ways:

1. **DAO-based Implementation** (Traditional approach with JDBC/DAO pattern)
2. **Spring Data JPA-based Implementation** (Using Spring Data JPA for database operations)
3. **Spring Data REST-based Implementation** (Exposing REST endpoints automatically with Spring Data REST)

## Technologies Used
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **Spring Data REST**
- **Hibernate** (for ORM in JPA-based implementation)
- **PostgreSQL** (Database)
- **Maven** (Dependency Management)

## Database Configuration (PostgreSQL)
Ensure PostgreSQL is installed and running.

Modify `application.properties` for database settings:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## Running the Application

### Clone the Repository
```sh
git clone https://github.com/your-repo-url.git
cd employee-crud-project
```

### Build and Run with Maven
```sh
mvn spring-boot:run
```

## API Endpoints

### **1. DAO-Based Implementation**
- **GET** `/api/employees` → Get all employees
- **GET** `/api/employees/{id}` → Get employee by ID
- **POST** `/api/employees` → Create a new employee
- **PUT** `/api/employees/{id}` → Update an existing employee
- **DELETE** `/api/employees/{id}` → Delete an employee

### **2. Spring Data JPA-Based Implementation**
- Same endpoints as DAO-based but implemented using `JpaRepository`.

### **3. Spring Data REST-Based Implementation**
- Spring Data REST automatically generates endpoints like:
  - **GET** `/employees`
  - **POST** `/employees`
  - **PUT** `/employees/{id}`
  - **DELETE** `/employees/{id}`

## Contributing
Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License.

