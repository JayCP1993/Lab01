package model;

/**
 * PartTimeEmployee.java
 *
 * This class represents a part-time employee in the system.
 * It extends the abstract Employee class and implements the clockIn, clockOut, and trackWorkHours methods.
 */

public class PartTimeEmployee extends Employee {

    /**
     * Constructor for PartTimeEmployee, initializing all attributes.
     */
    public PartTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary); // Call the superclass constructor
    }

    @Override
    public void clockIn() {
        System.out.println("Part-time employee clocking in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Part-time employee clocking out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking part-time employee work hours.");
    }
}
