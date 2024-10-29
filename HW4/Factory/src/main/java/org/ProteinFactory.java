package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory extends MacronutrientFactory{
    private static ProteinFactory instance;
    private String[] options = {"Fish", "Chicken", "Beef", "Tofu"};
    private String[] paleo = {"Fish", "Chicken", "Beef"};
    private String[] vegan = {"Beef", "Tofu"};

    public ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    public String getOption(String dietPlan) {
        List<String> availableOptions = new ArrayList<>();

        switch (dietPlan) {
            case "No Restriction":
                availableOptions.addAll(List.of(options));
                break;
            case "Vegan":
                availableOptions.addAll(List.of(vegan));
                break;
            case "Paleo":
                availableOptions.addAll(List.of(paleo));
                break;
            case "Nut Allergy":
                availableOptions.addAll(List.of(options));
                break;
            default:
                System.out.println("Invalid diet plan");
        }

        return availableOptions.get(new Random().nextInt(availableOptions.size()));
    }
}

