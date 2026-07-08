package com.vamsi.ems.service;

import com.vamsi.ems.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    // Stores all employees
    private final List<Employee> employeeList = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // View Employees
    public List<Employee> getEmployees() {
        return employeeList;
    }

    // Get Total Employee Count
    public int getEmployeeCount() {
        return employeeList.size();
    }
}