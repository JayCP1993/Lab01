/**
 * File name: EmployeeManager.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: 03-10-2024
 * Purpose: This class implements the Singleton pattern to ensure that there is only one instance
 * of EmployeeManager, responsible for managing employees.
 */

package singleton;

import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    // The single instance of EmployeeManager (Singleton)
    private static EmployeeManager instance;
    private List<Employee> employees;

    // Private constructor to restrict instantiation from other classes
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Public method to provide access to the singleton instance
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    // Method to add an employee to the list
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display all employees
    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Role: " + employee.getRole());
            System.out.println("Working Hours Per Week: " + employee.getWorkingHoursPerWeek());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }

    // Getter for the employees list (this was missing)
    public List<Employee> getEmployees() {
        return employees;
    }
}
