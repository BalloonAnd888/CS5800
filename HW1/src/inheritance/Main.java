package inheritance;

class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getSsn();
    }
}

class SalariedEmployee extends Employee {
    private String weeklySalary;

    SalariedEmployee(String firstName, String lastName, String ssn, String weeklySalary) {
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

class HourlyEmployee extends Employee {
    private String wage;
    private int hoursWorked;

    HourlyEmployee(String firstName, String lastName, String ssn, String wage, int hoursWorked) {
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

class CommissionEmployee extends Employee {
    private String commissionRate;
    private String grossSales;

    CommissionEmployee(String firstName, String lastName, String ssn, String commissionRate, String grossSales) {
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

class BaseEmployee extends Employee {
    private String baseSalary;

    BaseEmployee(String firstName, String lastName, String ssn, String baseSalary) {
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

public class Main {
    public static void main(String[] args) {
//        Employee e1 = new Employee("Joe", "Jones", "111-11-1111");
//        System.out.println(e1);
        System.out.println("Inheritance");

        SalariedEmployee s1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", "2500");
        System.out.println(s1);

        HourlyEmployee h1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", "25", 32);
        System.out.println(h1);

        HourlyEmployee h2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", "19", 47);
        System.out.println(h2);

        CommissionEmployee c1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", "15", "50000");
        System.out.println(c1);

        SalariedEmployee s2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", "1700");
        System.out.println(s2);

        BaseEmployee b1 = new BaseEmployee("Mike", "Davenport", "666-66-6666", "95000");
        System.out.println(b1);

        CommissionEmployee c2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", "22", "40000");
        System.out.println(c2);
    }
}
