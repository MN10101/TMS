# Teacher Management System

## Overview
The Teacher Management System is a web application designed to manage teachers' information. It allows users to add, update, view, and delete teacher records. The application uses Spring Boot, Thymeleaf, and Spring Data JPA for backend operations and HTML/CSS for the frontend.

## Features
- Add a new teacher
- View a list of all teachers
- Update an existing teacher's information
- Delete a teacher

## Technologies Used
- Spring Boot
- Thymeleaf
- Spring Data JPA
- HTML/CSS
- MySQL (or any other relational database)

## Setup Instructions
1. **Clone the repository**
    ```bash
    git clone <repository-url>
    ```

2. **Navigate to the project directory**
    ```bash
    cd teacherManagementSystem
    ```

3. **Configure the database**
    - Update the `application.properties` file with your database configuration.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
    ```

4. **Build and run the application**
    ```bash
    mvn spring-boot:run
    ```

5. **Access the application**
    - Open your browser and go to `http://localhost:8080/teachers/get` to view the list of teachers.

## Project Structure
- `src/main/java/com/exercise/teachermanagementsystem`: Contains the Java source code including controllers, services, entities, and repositories.
- `src/main/resources/templates`: Contains Thymeleaf templates for the frontend.
- `src/main/resources/static/styles`: Contains CSS files for styling the frontend.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## Screenshots

![1](https://github.com/user-attachments/assets/05c613a4-eb9b-4957-a4aa-5ba4b4ebb5de)
![2](https://github.com/user-attachments/assets/b1fe84ff-bdfa-493d-8357-7931e3e5f597)
