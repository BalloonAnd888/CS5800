package HW4.Factory.src.main.java.org;

public class Customer {
    private String name;
    private String dietPlan;
    private String carb;
    private String protein;
    private String fat;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
        createMeal(dietPlan);
    }

    private void createMeal(String dietPlan) {
        MacronutrientFactory carbFactory = FactoryCreator.createFactory("Carbs");
        this.carb = carbFactory.getOption(dietPlan);

        MacronutrientFactory proteinFactory = FactoryCreator.createFactory("Protein");
        this.protein = proteinFactory.getOption(dietPlan);

        MacronutrientFactory fatFactory = FactoryCreator.createFactory("Fats");
        this.fat = fatFactory.getOption(dietPlan);
    }

    public String getCarb() {
        return carb;
    }

    public String getProtein() {
        return protein;
    }

    public String getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " Diet Plan: " + dietPlan + " Meal: [Carb: " + carb + ", Protein: " + protein + ", Fat: " + fat + "]";
    }
}