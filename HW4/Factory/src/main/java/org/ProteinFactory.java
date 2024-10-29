package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory extends MacronutrientFactory{
    private static ProteinFactory instance;
    private String[] options = {"Fish", "Chicken", "Beef", "Tofu"};

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    public String getOption(String dietPlan) {
        List<String> availableOptions = new ArrayList<>();
        for (String option : options) {
            if (!("Vegan".equals(dietPlan) && ("Fish".equals(option) || "Chicken".equals(option) || "Beef".equals(option))) &&
                    !("Paleo".equals(dietPlan) && "Tofu".equals(option))) {
                availableOptions.add(option);
            }
        }
        return availableOptions.get(new Random().nextInt(availableOptions.size()));
    }
}
