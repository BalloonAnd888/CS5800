package HW4.Factory.src.test.java;

import HW4.Factory.src.main.java.org.Customer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {

    @Test
    public void testCreateMeal() {
        Customer customer = new Customer("Name", "Vegan");
        List<String> veganCarbs = Arrays.asList("Bread", "Lentils", "Pistachio");
        List<String> veganProteins = Arrays.asList("Beef", "Tofu");
        List<String> veganFats = Arrays.asList("Avocado", "Peanuts");

        assertTrue(veganCarbs.contains(customer.getCarb()));
        assertTrue(veganProteins.contains(customer.getProtein()));
        assertTrue(veganFats.contains(customer.getFat()));
    }
}
