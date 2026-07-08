package com.vamsi.ems;

import com.vamsi.ems.model.Employee;
import com.vamsi.ems.service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Employee Role: ");
                    String role = scanner.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(id, name, role, salary);

                    employeeService.addEmployee(employee);

                    System.out.println("\nEmployee Added Successfully!");

                    break;

                case 2:

                    List<Employee> employees = employeeService.getEmployees();

                    if (employees.isEmpty()) {
                        System.out.println("\nNo Employees Found!");
                    } else {

                        System.out.println("\n========== Employee List ==========");

                        for (Employee emp : employees) {
                            System.out.println("-----------------------------------");
                            System.out.println("ID     : " + emp.getId());
                            System.out.println("Name   : " + emp.getName());
                            System.out.println("Role   : " + emp.getRole());
                            System.out.println("Salary : " + emp.getSalary());
                        }

                        System.out.println("-----------------------------------");
                    }

                    break;

                case 3:

                    System.out.println("\nThank You!");

                    scanner.close();
                    System.exit(0);

                default:

                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}