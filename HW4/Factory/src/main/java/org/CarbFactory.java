package HW4.Factory.src.main.java.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbFactory extends MacronutrientFactory{
    private String[] options = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private String[] paleo = {"Pistachio"};
    private String[] vegan = {"Bread", "Lentils", "Pistachio"};
    private String[] nutAllergy = {"Cheese", "Bread", "Lentils"};

    private static CarbFactory instance;

    public CarbFactory() {}

    public static CarbFactory getInstance() {
        if(instance == null) {
            instance = new CarbFactory();
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
            case "Paleo":
                availableOptions.addAll(List.of(paleo));
                break;
            case "Vegan":
                availableOptions.addAll(List.of(vegan));
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
