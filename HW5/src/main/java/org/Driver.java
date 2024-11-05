package HW5.src.main.java.org;

import HW5.src.main.java.org.food.Burger;
import HW5.src.main.java.org.food.Fries;
import HW5.src.main.java.org.food.HotDog;
import HW5.src.main.java.org.loyalty.Loyalty;
import HW5.src.main.java.org.order.Order;
import HW5.src.main.java.org.toppings.Bacon;
import HW5.src.main.java.org.toppings.Cheese;
import HW5.src.main.java.org.toppings.Lettuce;
import HW5.src.main.java.org.toppings.Tomato;

public class Driver {
    public static void main(String[] args) {
        Order order = new Order();
        order.addFood(new Lettuce(new Tomato(new Burger())));
        order.addFood(new Bacon(new Fries()));
        order.addFood(new Bacon(new Cheese(new HotDog())));

        System.out.println("Total before discount: $" + order.calculateTotalCost());

        Loyalty loyalty = new Loyalty();
        System.out.println("Total after discount: $" + loyalty.applyDiscount(order.calculateTotalCost(), "diamond"));
    }
}
