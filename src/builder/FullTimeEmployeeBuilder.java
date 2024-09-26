/**
 * File name: FullTimeEmployeeBuilder.java
 * Author: Jay Pathak
 * Course: CST8288 - section#
 * Term: Fall 2024
 * Assignment: Lab 1
 * Date: [Insert Date]
 * Purpose: This class implements the EmployeeBuilder interface and provides
 *          a concrete implementation for building full-time employees.
 */

package builder;

import model.FullTimeEmployee;

public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;
    private int workingHoursPerWeek;
    private double salary;

    @Override
	public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
	public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
	public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
	public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
	public EmployeeBuilder setWorkingHoursPerWeek(int hours) {
        this.workingHoursPerWeek = hours;
        return this;
    }

    @Override
	public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
	public FullTimeEmployee build() {
        return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
    }
}
