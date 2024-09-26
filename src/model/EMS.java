/**
 * File name: EMS.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This is the main simulation class that demonstrates the usage of the Singleton,
 *          Builder, and Factory patterns to create and manage employees dynamically.
 */
package model;

import java.util.Scanner;

import factory.EmployeeFactory;
import singleton.EmployeeManager;

public class EMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get Singleton instance of EmployeeManager
        EmployeeManager manager = EmployeeManager.getInstance();

        // Step 2: Create EmployeeFactory instance
        EmployeeFactory factory = new EmployeeFactory();

        // Get user input for employee type
        System.out.println("Enter employee type (FullTime/PartTime): ");
        String type = scanner.nextLine();

        // Get user input for other employee attributes
        System.out.println("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter department: ");
        String department = scanner.nextLine();
        System.out.println("Enter role: ");
        String role = scanner.nextLine();
        System.out.println("Enter working hours per week: ");
        int hours = scanner.nextInt();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        // Step 3: Create employee based on user input
        Employee employee = factory.createEmployee(type, id, name, department, role, hours, salary);

        // Step 4: Add employee to EmployeeManager
        if (employee != null) {
            manager.addEmployee(employee);
            System.out.println("Employee added: " + employee.getName());
        } else {
            System.out.println("Invalid employee type.");
        }

        // Display all employees
        manager.displayAllEmployees();

        scanner.close();
    }
}
