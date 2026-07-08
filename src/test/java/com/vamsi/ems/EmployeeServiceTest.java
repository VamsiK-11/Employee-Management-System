package com.vamsi.ems;

import com.vamsi.ems.model.Employee;
import com.vamsi.ems.service.EmployeeService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        System.out.println("Test Started");
    }

    @Test
    void testAddEmployee() {

        Employee employee = new Employee(
                101,
                "Vamsi",
                "DevOps Engineer",
                70000
        );

        employeeService.addEmployee(employee);

        assertEquals(1, employeeService.getEmployeeCount());
    }

    @Test
    void testEmployeeCount() {

        employeeService.addEmployee(
                new Employee(101, "Vamsi", "DevOps Engineer", 70000));

        employeeService.addEmployee(
                new Employee(102, "Rahul", "Java Developer", 60000));

        assertEquals(2, employeeService.getEmployeeCount());
    }

    @Test
    void testGetEmployees() {

        Employee employee = new Employee(
                101,
                "Vamsi",
                "DevOps Engineer",
                70000
        );

        employeeService.addEmployee(employee);

        assertFalse(employeeService.getEmployees().isEmpty());

        assertEquals("Vamsi",
                employeeService.getEmployees().get(0).getName());

        assertEquals("DevOps Engineer",
                employeeService.getEmployees().get(0).getRole());

        assertEquals(70000,
                employeeService.getEmployees().get(0).getSalary());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Completed");
    }
}