package com.vamsi.ems.service;

import com.vamsi.ems.model.Employee;
import com.vamsi.ems.dao.EmployeeDAO;
import java.util.List;

public class EmployeeService {

    private final EmployeeDAO eDAO = new EmployeeDAO();

    // Add Employee
    public boolean addEmployee(Employee employee) {
        return eDAO.addEmployee(employee);
    }

    // View Employees
    public List<Employee> getEmployees() {
        return eDAO.getEmployees();
    }

}