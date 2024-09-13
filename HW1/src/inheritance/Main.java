package inheritance;

import inheritance.baseEmployee.BaseEmployee;
import inheritance.commissionEmployee.CommissionEmployee;
import inheritance.hourlyEmployee.HourlyEmployee;
import inheritance.salariedEmployee.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
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
