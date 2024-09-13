package inheritance.salariedEmployee;

import inheritance.employee.Employee;

public class SalariedEmployee extends Employee {
    protected String weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, String weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public String getWeeklySalary() {
        return weeklySalary;
    }

    public String toString() {
        return super.toString() + " $" + getWeeklySalary();
    }
}
