package inheritance.baseEmployee;

import inheritance.employee.Employee;

public class BaseEmployee extends Employee {
    protected String baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, String baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public String toString() {
        return super.toString() + " $" + getBaseSalary();
    }
}
