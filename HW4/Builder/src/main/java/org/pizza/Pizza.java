package HW4.Builder.src.main.java.org.pizza;

import java.util.List;

public class Pizza {
    private List<String> toppings;
    private String chain;
    private String size;

    public Pizza(List<String> toppings, String chain, String size) {
        this.toppings = toppings;
        this.chain = chain;
        this.size = size;
    }

    public String eat() {
        String eat = chain + " " + size + " pizza with toppings: " + String.join(", ", toppings);
        System.out.println(eat);
        return eat;
    }
}
