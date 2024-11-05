package HW5.src.test.java;

import HW5.src.main.java.org.loyalty.Loyalty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyTest {
    @Test
    public void testLoyaltyDiscount() {
        Loyalty loyalty = new Loyalty();
        double total = loyalty.applyDiscount(50, "silver");
        assertEquals(45, total);
    }
}
