package HW5.src.main.java.org.toppings;

import HW5.src.main.java.org.food.Food;

public abstract class ToppingsDecorator implements Food {
    protected final Food food;

    public ToppingsDecorator(Food food) {
        this.food = food;
    }
}
