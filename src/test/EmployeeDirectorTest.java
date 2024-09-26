package test;  // Ensure this matches your folder structure

import static org.junit.Assert.*;
import org.junit.Test;
import builder.EmployeeDirector;
import builder.FullTimeEmployeeBuilder;
import model.Employee;

/**
 * File name: EmployeeDirectorTest.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: 25-09-2024
 * Purpose: This JUnit test file tests the Builder pattern for the EmployeeDirector class.
 *          It ensures that a FullTimeEmployee is constructed correctly with all
 *          attributes set using the FullTimeEmployeeBuilder.
 */

public class EmployeeDirectorTest {

    @Test
    public void testFullTimeEmployeeConstruction() {
        FullTimeEmployeeBuilder builder = new FullTimeEmployeeBuilder(); // Initialize builder
        EmployeeDirector director = new EmployeeDirector(builder); // Use director to build employee
        Employee employee = director.constructEmployee(); // Construct employee
        
        // Verify that the employee object is not null
        assertNotNull(employee);
        
        // Verify that all attributes are set correctly
        assertEquals(3, employee.getId());  // Ensure the ID is correct (adjust as needed)
        assertEquals("Alice White", employee.getName());
        assertEquals("Finance", employee.getDepartment());
        assertEquals("Analyst", employee.getRole());
        assertEquals(35, employee.getWorkingHoursPerWeek());
        assertEquals(60000, employee.getSalary(), 0.01);
    }
}
