package builder;

import model.Employee;

/**
 * EmployeeDirector.java
 *
 * This class is responsible for managing the construction of employees
 * using the EmployeeBuilder. It orchestrates the steps to build an employee.
 */
public class EmployeeDirector {
    private EmployeeBuilder builder;

    // Constructor accepts a builder instance
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    // Method to construct an employee using the builder
    public Employee constructEmployee() {
        return builder
                .setId(3)
                .setName("Alice White")
                .setDepartment("Finance")
                .setRole("Analyst")
                .setWorkingHoursPerWeek(35)
                .setSalary(60000)
                .build();
    }
}
