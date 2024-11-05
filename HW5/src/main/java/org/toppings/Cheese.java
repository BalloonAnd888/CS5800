package HW5.src.main.java.org.toppings;

import HW5.src.main.java.org.food.Food;

public class Cheese extends ToppingsDecorator{
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.25;
    }

    @Override
    public String getName() {
        return food.getName() + ", Cheese";
    }
}
