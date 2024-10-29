package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FatFactory extends MacronutrientFactory{
    private static FatFactory instance;
    private String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
    private String[] paleo = {"Avocado", "Tuna", "Peanuts"};
    private String[] vegan = {"Avocado", "Peanuts"};
    private String[] nutAllergy = {"Avocado", "Sour cream", "Tuna"};

    public FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
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
                availableOptions.addAll(List.of(nutAllergy));
                break;
            default:
                System.out.println("Invalid diet plan");
        }

        return availableOptions.get(new Random().nextInt(availableOptions.size()));
    }
}
