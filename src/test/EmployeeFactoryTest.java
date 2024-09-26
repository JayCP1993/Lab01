package test;  // Ensure this package declaration matches your folder structure

import static org.junit.Assert.*;
import org.junit.Test;
import factory.EmployeeFactory;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

/**
 * File name: EmployeeFactoryTest.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: 25-09-2024
 * Purpose: This JUnit test file tests the Factory pattern for the EmployeeFactory class.
 *          It ensures that FullTime and PartTime employees are correctly created with
 *          appropriate attributes based on the input type.
 */

public class EmployeeFactoryTest {

    @Test
    public void testFullTimeEmployeeCreation() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("FullTime", 1, "John Doe", "IT", "Developer", 40, 75000);
        
        // Assert that the created employee is an instance of FullTimeEmployee
        assertTrue(employee instanceof FullTimeEmployee);
        
        // Verify that all attributes are correctly set
        assertEquals(1, employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals("Developer", employee.getRole());
        assertEquals(40, employee.getWorkingHoursPerWeek());
        assertEquals(75000, employee.getSalary(), 0.01);
    }

    @Test
    public void testPartTimeEmployeeCreation() {
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("PartTime", 2, "Jane Doe", "HR", "Assistant", 20, 25000);
        
        // Assert that the created employee is an instance of PartTimeEmployee
        assertTrue(employee instanceof PartTimeEmployee);
        
        // Verify that all attributes are correctly set
        assertEquals(2, employee.getId());
        assertEquals("Jane Doe", employee.getName());
        assertEquals("HR", employee.getDepartment());
        assertEquals("Assistant", employee.getRole());
        assertEquals(20, employee.getWorkingHoursPerWeek());
        assertEquals(25000, employee.getSalary(), 0.01);
    }
}
