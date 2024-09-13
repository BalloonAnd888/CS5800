package polymorphism.ship;

public class Ship {
    protected String name;
    protected String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void print() {
        System.out.println("Name: " + getName() + " Year: " + getYear());
    }
}
