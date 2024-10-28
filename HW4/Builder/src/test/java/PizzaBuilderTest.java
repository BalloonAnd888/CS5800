package HW4.Builder.src.test.java;

import org.junit.jupiter.api.Test;
import org.pizzabuilder.PizzaBuilder;
import org.pizza.Pizza;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaBuilderTest {

    PizzaBuilder pizzaBuilder = new PizzaBuilder();

    @Test
    public void testAddToppings() {
        pizzaBuilder.addToppings(new String[] {"Pepperoni", "Chicken", "Spinach"});
        String[] expected = new String[] {"Pepperoni", "Chicken", "Spinach"};
        String[] actual = pizzaBuilder.getToppings(); // Fetch the current toppings
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetSize() {
        pizzaBuilder.setSize("Small");
        String actual = pizzaBuilder.getSize();
        String expected = "Small";
        assertEquals(expected, actual);
    }

    @Test
    public void testSetChain() {
        pizzaBuilder.setChain("org.pizza.Pizza Hut");
        String actual = pizzaBuilder.getChain();
        String expected = "org.pizza.Pizza Hut";
        assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        Pizza pizza = pizzaBuilder
                .setChain("Dominos")
                .setSize("Medium")
                .addToppings(new String[] {"Mushrooms", "Olives"})
                .build();

        String expected = "Dominos Medium pizza with toppings: Mushrooms, Olives";
        String actual = pizza.eat();
        assertEquals(expected, actual);
    }
}
