package test;  // Ensure this package declaration matches your folder structure

import static org.junit.Assert.*;
import org.junit.Test;
import singleton.EmployeeManager;
import model.FullTimeEmployee;

/**
 * File name: EmployeeManagerTest.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: 25-09-2024
 * Purpose: This JUnit test file tests the Singleton pattern for the EmployeeManager class.
 *          It ensures that only one instance of EmployeeManager is created and that
 *          employees can be added and retrieved correctly.
 */

public class EmployeeManagerTest {

    @Test
    public void testSingletonInstance() {
        EmployeeManager manager1 = EmployeeManager.getInstance(); // First instance
        EmployeeManager manager2 = EmployeeManager.getInstance(); // Second instance
        assertEquals(manager1, manager2);  // Both instances should point to the same object
    }

    @Test
    public void testAddEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        FullTimeEmployee employee = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 75000);
        manager.addEmployee(employee); // Add employee to the manager
        assertNotNull(manager.getEmployee(1));  // Ensure employee is added and can be retrieved
        assertEquals("John Doe", manager.getEmployee(1).getName()); // Ensure employee's name is correct
    }
}
