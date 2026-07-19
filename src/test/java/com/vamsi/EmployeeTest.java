package com.vamsi;

import com.vamsi.ems.config.DBConnection;
import com.vamsi.ems.model.Employee;
import com.vamsi.ems.service.EmployeeService;

import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

        private EmployeeService employeeService;

        @BeforeEach
        void setUp() throws SQLException {

                employeeService = new EmployeeService();

                cleanTestData();

                System.out.println("Test Started");
        }

        @Test
        void testAddAndGetEmployee() {

                Employee employee = new Employee(
                                0,
                                "Vamsi",
                                "DevOps Engineer",
                                70000);

                boolean isAdded = employeeService.addEmployee(employee);

                // Verify insert operation
                assertTrue(isAdded);

                // Verify data retrieval
                List<Employee> employees = employeeService.getEmployees();

                assertFalse(employees.isEmpty());

                Employee savedEmployee = employees.get(0);

                assertEquals(0, savedEmployee.getId());

                assertEquals(
                                "Vamsi",
                                savedEmployee.getName());

                assertEquals(
                                "DevOps Engineer",
                                savedEmployee.getRole());

                assertEquals(
                                70000,
                                savedEmployee.getSalary());
        }

        @AfterEach
        void tearDown() throws SQLException {

                cleanTestData();

                System.out.println("Test Completed");
        }

        private void cleanTestData() throws SQLException {

                Connection connection = DBConnection.getConnection();

                String query = "DELETE FROM employees WHERE id = ?";

                PreparedStatement statement = connection.prepareStatement(query);

                statement.setInt(1, 0);

                statement.executeUpdate();

                statement.close();

                connection.close();
        }
}