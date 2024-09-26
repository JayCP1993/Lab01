/**
 * File name: EmployeeFactory.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This class implements the Factory pattern to create different types of employees
 *          dynamically based on the provided input (e.g., FullTime, PartTime).
 */

package factory;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

public class EmployeeFactory {

    /**
     * Creates and returns an employee based on the specified type and attributes.
     */
    public Employee createEmployee(String type, int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        if (type.equalsIgnoreCase("FullTime")) {
            return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        } else if (type.equalsIgnoreCase("PartTime")) {
            return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        }
        return null; // Return null if type is invalid
    }
}
