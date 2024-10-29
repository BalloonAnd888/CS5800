package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbFactory extends MacronutrientFactory{
    private String[] options = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private static CarbFactory instance;

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        if(instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    @Override
    public String getOption(String dietPlan) {
        List<String> availableOptions = new ArrayList<>();
        for(String option : options) {
            if (!("Paleo".equals(dietPlan) && ("Cheese".equals(option) || "Bread".equals(option) || "Lentils".equals(option))) &&
                !("Nut Allergy".equals(dietPlan) && "Pistachio".equals(option))) {
            availableOptions.add(option);
            }
        }

        return availableOptions.get(new Random().nextInt(availableOptions.size()));
    }
}
