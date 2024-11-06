package HW5.src.test.java;

import HW5.src.main.java.org.food.Burger;
import HW5.src.main.java.org.food.Food;
import HW5.src.main.java.org.food.Fries;
import HW5.src.main.java.org.order.Order;
import HW5.src.main.java.org.toppings.Bacon;
import HW5.src.main.java.org.toppings.Cheese;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    public void testCalculateTotalCost() {
        Order order = new Order();

        order.addFood(new Burger());
        order.addFood(new Cheese(new Burger()));
        order.addFood(new Bacon(new Fries()));
        assertEquals(14.75, order.calculateTotalCost());
    }

    @Test
    public void testAddFood() {
        Order order = new Order();

        Burger burger = new Burger();
        Cheese cheeseBurger = new Cheese(new Burger());

        order.addFood(burger);
        order.addFood(cheeseBurger);

        List<Food> foods = order.getFoods();

        assertEquals(2, foods.size());
        assertTrue(foods.contains(burger));
        assertTrue(foods.contains(cheeseBurger));
    }
}
