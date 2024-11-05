package HW5.src.main.java.org.order;

import HW5.src.main.java.org.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> foods = new ArrayList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Food food : foods) {
            total += food.getCost();
        }
        return total;
    }
}
