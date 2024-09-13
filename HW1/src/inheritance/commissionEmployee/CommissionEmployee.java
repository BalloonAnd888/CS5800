package inheritance.commissionEmployee;

import inheritance.employee.Employee;

public class CommissionEmployee extends Employee {
    protected String commissionRate;
    protected String grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, String commissionRate, String grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public String getGrossSales() {
        return grossSales;
    }

    public String toString() {
        return super.toString() + " " + getCommissionRate() + "% $" + getGrossSales();
    }
}
