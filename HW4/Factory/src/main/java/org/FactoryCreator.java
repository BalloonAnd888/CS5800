package HW4.Factory.src.main.java.org;

public class FactoryCreator {
    public static MacronutrientFactory createFactory(String macronutrientType) {
        return switch (macronutrientType) {
            case "Carbs" -> CarbFactory.getInstance();
            case "Protein" -> ProteinFactory.getInstance();
            case "Fats" -> FatFactory.getInstance();
            default -> throw new IllegalArgumentException("Unknown macronutrient type: " + macronutrientType);
        };
    }
}
