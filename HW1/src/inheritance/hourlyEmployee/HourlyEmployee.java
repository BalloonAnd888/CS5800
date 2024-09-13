package inheritance.hourlyEmployee;

import inheritance.employee.Employee;

public class HourlyEmployee extends Employee {
    protected String wage;
    protected int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, String wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public String getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String toString() {
        return super.toString() + " $" + getWage() + " " + getHoursWorked();
    }
}