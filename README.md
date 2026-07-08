# Employee Management System - Jenkins CI Pipeline

## Overview

Employee Management System (EMS) is a Java Maven application developed to demonstrate Continuous Integration (CI) using Jenkins Declarative Pipeline. The project showcases an automated build process including compilation, testing, packaging, artifact archiving and email notifications.

This project was built as part of my DevOps learning journey to understand how modern CI pipelines automate software builds and improve development workflows.

---

## Project Features

* Add Employee
* View Employee
* Maven based Java project
* Unit testing using JUnit
* Jenkins Declarative Pipeline
* Automated Maven build lifecycle
* Artifact generation and archiving
* Email notifications on build success and failure
* Version control using Git and GitHub

---

## Technologies Used

* Java 17
* Maven
* JUnit 5
* Jenkins
* Git
* GitHub
* Lombok

---

## Jenkins Pipeline Stages

The pipeline performs the following stages automatically:

1. Verify Environment

   * Verifies Java installation
   * Verifies Maven installation

2. Clean

   * Executes Maven Clean phase

3. Compile

   * Compiles application source code

4. Test

   * Executes JUnit test cases

5. Package

   * Generates executable JAR file

6. Verify Artifact

   * Verifies generated build artifact

7. Archive Artifact

   * Archives JAR file inside Jenkins
   * Generates artifact fingerprint

8. Post Build Actions

   * Sends email notification on Success
   * Sends email notification on Failure

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
│   │           ├── model
│   │           ├── service
│   │           └── Main.java
│   │
│   └── test
│       └── java
│
├── Jenkinsfile
├── pom.xml
├── .gitignore
└── README.md
```

---

## Build Pipeline Flow

```text
GitHub Repository
        │
        ▼
Jenkins Checkout
        │
        ▼
Verify Environment
        │
        ▼
Clean
        │
        ▼
Compile
        │
        ▼
Run Unit Tests
        │
        ▼
Package
        │
        ▼
Verify Artifact
        │
        ▼
Archive Artifact
        │
        ▼
Email Notification
```

---

## Running the Project Locally

Clone the repository

```bash
git clone https://github.com/VamsiK-11/Employee-Management-System.git
```

Navigate to the project

```bash
cd employee-management-system
```

Compile

```bash
mvn compile
```

Run tests

```bash
mvn test
```

Generate JAR

```bash
mvn package
```

---

## Jenkins Configuration

* Pipeline from SCM
* GitHub Repository Integration
* Artifact Archiving
* Email Notification
* Build Logs

---

## Version

Current Release

v1.0

