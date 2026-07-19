# Employee Management System (EMS)

## Overview

Employee Management System (EMS) is a Java Maven-based console application developed to demonstrate software development practices using Java, JDBC, MySQL, Git and DevOps workflows.

The project started as a simple employee management console application and evolved into a database-driven application by integrating MySQL using JDBC.

This project is part of my DevOps learning journey, focusing on application development, database integration, version control, containerization and CI/CD automation.

---

## Project Features

* Add Employee
* View Employee
* MySQL Database Integration using JDBC
* DAO based database operations
* Service layer for business logic
* JUnit 5 Integration Testing
* Git based feature branch workflow
* Jenkins Declarative Pipeline foundation

---

## Technologies Used

* Java 17
* Maven
* JDBC
* MySQL 9
* JUnit 5
* Git
* GitHub
* Jenkins

---

## Application Architecture

```text
Main.java
    |
    |
EmployeeService
    |
    |
EmployeeDAO
    |
    |
JDBC Connection
    |
    |
MySQL Database
```

### Layers

### Model Layer

Contains the Employee entity.

Example:

```text
Employee
- id
- name
- role
- salary
```

---

### Service Layer

Handles business logic and communicates between the application and database layer.

---

### DAO Layer

Responsible for database operations:

* Insert Employee
* Retrieve Employees

---

## Database Details

Database:

```text
employee_db
```

Table:

```text
employees
```

Table Structure:

```text
id
name
role
salary
```

The application connects to MySQL using JDBC Driver.

---

## Testing

JUnit 5 is used for integration testing.

Testing includes:

* Database connection verification
* Employee insertion verification
* Employee retrieval verification

Test flow:

```text
Clean Test Data

        ↓

Insert Employee

        ↓

Retrieve Employee

        ↓

Verify Employee Details

        ↓

Cleanup Test Data
```

---

## Jenkins CI Pipeline

The project contains a Jenkins Declarative Pipeline configuration.

Current Jenkins pipeline demonstrates:

1. Verify Environment

   * Verify Java installation
   * Verify Maven installation

2. Clean

   * Executes Maven clean phase

3. Compile

   * Compiles application source code

4. Test

   * Executes JUnit test cases

5. Package

   * Generates executable JAR artifact

6. Archive Artifact

   * Archives generated build artifact

7. Post Build Actions

   * Build notifications

---

## Maven Lifecycle Used

```text
mvn clean

mvn compile

mvn test

mvn package
```

---

## Project Structure

```text
employee-management-system
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.vamsi.ems
│   │           ├── config
│   │           │   └── DBConnection.java
│   │           │
│   │           ├── dao
│   │           │   └── EmployeeDAO.java
│   │           │
│   │           ├── model
│   │           │   └── Employee.java
│   │           │
│   │           ├── service
│   │           │   └── EmployeeService.java
│   │           │
│   │           └── Main.java
│   │
│   └── test
│       └── java
│           └── EmployeeServiceTest.java
│
├── Jenkinsfile
├── pom.xml
├── README.md
└── .gitignore
```

---

## Running the Project Locally

Clone the repository:

```bash
git clone https://github.com/VamsiK-11/Employee-Management-System.git
```

Navigate into project:

```bash
cd employee-management-system
```

Compile:

```bash
mvn compile
```

Run tests:

```bash
mvn test
```

Generate JAR:

```bash
mvn package
```

Run application:

```bash
java -jar target/employee-management-system.jar
```

---

## Git Workflow

The project follows feature-based development.

Example:

```text
develop

   |

feature/mysql-integration

   |

Merge into develop
```

Current development flow:

```text
Feature Branch
       |
       |
Development
       |
       |
Release Version
```

---

## Version

Current Release:

```text
v1.1
```

Release Notes:

```text
v1.1
- Added MySQL JDBC Integration
- Added DAO Layer
- Added Database Connection Management
- Added Integration Testing
```
