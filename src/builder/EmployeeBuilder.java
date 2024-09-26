/**
 * File name: EmployeeBuilder.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This is the interface for building employee objects step by step.
 *          It provides methods to set the employee attributes dynamically.
 */

package builder;

import model.Employee;

public interface EmployeeBuilder {
    EmployeeBuilder setId(int id);
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    EmployeeBuilder setWorkingHoursPerWeek(int hours);
    EmployeeBuilder setSalary(double salary);
    Employee build(); // Returns a fully constructed Employee object
}
