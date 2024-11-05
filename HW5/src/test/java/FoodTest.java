package HW5.src.test.java;

import HW5.src.main.java.org.food.Burger;
import HW5.src.main.java.org.food.Food;
import HW5.src.main.java.org.toppings.Bacon;
import HW5.src.main.java.org.toppings.Cheese;
import HW5.src.main.java.org.toppings.Tomato;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {
    @Test
    public void testBaseFoodCost() {
        Food burger = new Burger();
        assertEquals(5.0, burger.getCost());
    }

    @Test
    public void testBaconToppingCost() {
        Food burger = new Burger();
        burger = new Bacon(burger);
        assertEquals(5.5, burger.getCost());
    }

    @Test
    public void testMultipleToppingsCost() {
        Food burger = new Burger();
        burger = new Bacon(burger);
        burger = new Tomato(burger);
        burger = new Cheese(burger);
        assertEquals(6, burger.getCost());
    }
}
