import org.pizza.Pizza;
import org.pizzabuilder.PizzaBuilder;

public class Driver {
    public static void main(String[] args) {
        Pizza[] pizzaHut = new Pizza[3];

        System.out.println("Pizza Hut");
        pizzaHut[0] = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addToppings(new String[]{"Pepperoni", "Sausage", "Spinach"}).build();

        pizzaHut[1] = new PizzaBuilder().setChain("Pizza Hut").setSize("Medium").addToppings(new String[]{"Pepperoni", "Mushrooms", "Bacon", "Onions", "Chicken", "Ham"}).build();

        pizzaHut[2] = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addToppings(new String[]{"Sausage", "Mushrooms", "Bacon", "Extra Cheese", "Peppers", "Tomato and Basil", "Beef", "Ham", "Ham and Pineapple"}).build();

        for(Pizza pizza : pizzaHut) {
            pizza.eat();
        }

        Pizza[] pizzas = new Pizza[6];

        System.out.println("\nPizza Hut, Little Caesars, and Dominos");
        pizzas[0] = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").addToppings(new String[]{"Chicken", "Spinach", "Bacon"}).build();
        pizzas[1] = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").addToppings(new String[]{"Pepperoni", "Ham and Pineapple"}).build();
        pizzas[2] = new PizzaBuilder().setChain("Little Caesars").setSize("Medium").addToppings(new String[]{"Pepperoni", "Sausage", "Mushrooms", "Bacon", "Peppers", "Spinach", "Beef", "Ham"}).build();
        pizzas[3] = new PizzaBuilder().setChain("Little Caesars").setSize("Small").addToppings(new String[]{"Pepperoni", "Sausage", "Onions", "Extra Cheese", "Chicken", "Spinach"}).build();
        pizzas[4] = new PizzaBuilder().setChain("Dominos").setSize("Small").addToppings(new String[]{"Sausage"}).build();
        pizzas[5] = new PizzaBuilder().setChain("Dominos").setSize("Large").addToppings(new String[]{"Pepperoni", "Sausage", "Extra Cheese"}).build();

        for (Pizza pizza : pizzas) {
            pizza.eat();
        }
    }
}