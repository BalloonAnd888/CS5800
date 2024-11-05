package HW5.src.main.java.org.food;

public class Burger implements Food{
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getName() {
        return "Burger";
    }
}
