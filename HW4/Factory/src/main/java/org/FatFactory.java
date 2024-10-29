package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FatFactory extends MacronutrientFactory{
    private static FatFactory instance;
    private String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};

    private FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    @Override
    public String getOption(String dietPlan) {
        List<String> availableOptions = new ArrayList<>();
        for (String option : options) {
            if (!("Vegan".equals(dietPlan) && "Sour cream".equals(option)) &&
                    !("Paleo".equals(dietPlan) && "Sour cream".equals(option)) &&
                    !("Nut Allergy".equals(dietPlan) && "Peanuts".equals(option))) {
                availableOptions.add(option);
            }
        }
        return availableOptions.get(new Random().nextInt(availableOptions.size()));
    }
}
