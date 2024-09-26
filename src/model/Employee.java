/**
 * File name: Employee.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This is the abstract class that represents a generic employee in the system.
 *          It contains common employee attributes and abstract methods to be implemented
 *          by subclasses.
 */

package model;

public abstract class Employee {
    protected int id; // Unique employee ID
    protected String name; // Employee's name
    protected String department; // Department where the employee works
    protected String role; // Job role
    protected int workingHoursPerWeek; // Hours the employee works per week
    protected double salary; // Employee's salary

    /**
     * Constructor that initializes the common attributes for all employees.
     */
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // Abstract methods that must be implemented by subclasses
    public abstract void clockIn(); // When an employee clocks in for work
    public abstract void clockOut(); // When an employee clocks out after work
    public abstract void trackWorkHours(); // Tracks the number of hours worked

    // Getters for the attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public int getWorkingHoursPerWeek() {
        return workingHoursPerWeek;
    }

    public double getSalary() {
        return salary;
    }
}
