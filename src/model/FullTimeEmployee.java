package model;

/**
 * FullTimeEmployee.java
 *
 * This class represents a full-time employee in the system.
 * It extends the abstract Employee class and implements the clockIn, clockOut, and trackWorkHours methods.
 */

public class FullTimeEmployee extends Employee {

    /**
     * Constructor for FullTimeEmployee, initializing all attributes.
     */
    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary); // Call the superclass constructor
    }

    @Override
    public void clockIn() {
        System.out.println("Full-time employee clocking in.");
    }

    @Override
    public void clockOut() {
        System.out.println("Full-time employee clocking out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println("Tracking full-time employee work hours.");
    }
}
