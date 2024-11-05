package HW5.src.main.java.org.toppings;

import HW5.src.main.java.org.food.Food;

public class Lettuce extends ToppingsDecorator{
    public Lettuce(Food food) {
        super(food);
    }

    @Override
    public double getCost() {
        return food.getCost() + 0.5;
    }

    @Override
    public String getName() {
        return food.getName() + ", Lettuce";
    }
}
