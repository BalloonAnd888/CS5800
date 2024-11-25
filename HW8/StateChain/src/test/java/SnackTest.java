package HW8.StateChain.src.test.java;

import HW8.StateChain.src.main.java.org.Snack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnackTest {
    @Test
    public void testGetName() {
        Snack snack = new Snack("Coke", 3.99, 10);
        assertEquals("Coke", snack.getName());
    }

    @Test
    public void testGetPrice() {
        Snack snack = new Snack("Coke", 3.99, 10);
        assertEquals(3.99, snack.getPrice(), 0);
    }

    @Test
    public void testGetQuantity() {
        Snack snack = new Snack("Coke", 3.99, 10);
        assertEquals(10, snack.getQuantity());

    }
}
