/**
 * File name: EmployeeManager.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This class follows the Singleton design pattern to manage all employees
 *          in the system. It ensures that only one instance of EmployeeManager is created.
 */

package singleton;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeManager {
    private static EmployeeManager instance; // The single instance of EmployeeManager
    private List<Employee> employees; // List to store employee records

    // Private constructor to prevent instantiation from outside
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    /**
     * Static method to return the single instance of EmployeeManager.
     */
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager(); // Create a new instance if it doesn't exist
        }
        return instance;
    }

    /**
     * Adds an employee to the list.
     */
    public void addEmployee(Employee employee) {
        employees.add(employee); // Add the employee to the list
    }

    /**
     * Removes an employee from the list by ID.
     */
    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id); // Remove employee by ID
    }

    /**
     * Retrieves an employee by their ID.
     */
    public Employee getEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee; // Return the employee if ID matches
            }
        }
        return null; // Return null if not found
    }

    /**
     * Displays all employees managed by EmployeeManager.
     */
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                                   ", Department: " + employee.getDepartment() + ", Role: " + employee.getRole() +
                                   ", Working Hours: " + employee.getWorkingHoursPerWeek() + ", Salary: " + employee.getSalary());
            }
        }
    }
}
