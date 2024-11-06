package HW5.src.main.java.org.toppings;

import HW5.src.main.java.org.food.Food;

public class Bacon extends ToppingsDecorator{
    public Bacon(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.5;
    }
}
