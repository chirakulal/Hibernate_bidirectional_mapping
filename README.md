# University Management System - Hibernate Project

## Overview
This project is a backend system using Hibernate ORM to manage a university's entities. It connects to a PostgreSQL database using JPA annotations and demonstrates basic CRUD operations with cascading persistence. The project primarily deals with a single entity, `University`, and its relationships with other entities such as `College`, `Department`, `Bus`, `Student`, and `Lecturer`.

## Technologies Used
- Java
- Hibernate ORM
- JPA Annotations
- PostgreSQL
- Maven (for dependency management)

## Setup Instructions

### Prerequisites
- Java 8+
- PostgreSQL
- Maven

### Steps to Set Up
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/university-hibernate-project.git
   cd university-hibernate-project
   
2. **Database Setup:**
Install PostgreSQL and create a database named university_db.
Update the hibernate.cfg.xml file with your PostgreSQL connection details.

3. **Build the Project:**
   mvn clean install

4.**Run the Project**: Execute the main class through your IDE or use the Maven command:
mvn exec:java -Dexec.mainClass="com.example.university.Main"

**##Other Entity Classes**
College.java
Department.java
Bus.java
Student.java
Lecturer.java
These entities will also have relationships using @ManyToOne, @OneToMany, and CascadeType.


