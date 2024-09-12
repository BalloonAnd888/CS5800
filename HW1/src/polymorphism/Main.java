package polymorphism;

class Ship {
    private String name;
    private String year;

    Ship(String name, String year) {
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

class CruiseShip extends Ship {
    private int maxPassengers;
    CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void print() {
        System.out.println("Name: " + getName() + " Maximum number of passengers: " + getMaxPassengers());
    }
}

class CargoShip extends Ship {
    private int tonnage;
    CargoShip(String name, String year, int maxPassengers, int tonnage) {
        super(name, year);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void print() {
        System.out.println("Name: " + getName() + " Tonnage: " + getTonnage());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism");

        Ship ship = new Ship("Bob", "1996");
        ship.print();

        CruiseShip cruiseShip = new CruiseShip("Bob", "1996", 5);
        cruiseShip.print();

        CargoShip cargoShip = new CargoShip("Bob", "1996", 5, 1);
        cargoShip.print();
    }
}
