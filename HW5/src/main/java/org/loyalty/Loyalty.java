package HW5.src.main.java.org.loyalty;

public class Loyalty {
    public double applyDiscount(double totalCost, String tier) {
        double discount = switch (tier.toLowerCase()) {
            case "bronze" -> 0.05;
            case "silver" -> 0.10;
            case "gold" -> 0.15;
            case "platinum" -> 0.20;
            case "diamond" -> 0.25;
            default -> 0.0;
        };

        return Math.round((totalCost * (1 - discount)) * 100.0) / 100.0;
    }
}
