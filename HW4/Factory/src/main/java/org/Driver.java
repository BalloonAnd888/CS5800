package HW4.Factory.src.main.java.org;

public class Driver {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Brian", "No Restriction"),
                new Customer("Tommy", "Paleo"),
                new Customer("Wilbert", "Nut Allergy"),
                new Customer("Stanley", "Vegan"),
                new Customer("Alan", "Paleo"),
                new Customer("Trisha", "Nut Allergy"),
        };

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
