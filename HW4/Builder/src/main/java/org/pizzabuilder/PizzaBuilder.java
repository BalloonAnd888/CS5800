package HW4.Builder.src.main.java.org.pizzabuilder;
import HW4.Builder.src.main.java.org.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private List<String> toppings = new ArrayList<>();
    private String chain;
    private String size;

    public PizzaBuilder() {}

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public String getSize() {
        return size;
    }

    public String getChain() {
        return chain;
    }

    public PizzaBuilder addToppings(String[] toppings) {
        for (String topping : toppings) {
            this.toppings.add(topping);
        }
        return this;
    }

    public String[] getToppings() {
        return toppings.toArray(new String[toppings.size()]);
    }

    public Pizza build() {
        return new Pizza(toppings, chain, size);
    }
}

