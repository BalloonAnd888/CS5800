package polymorphism.cargoship;

import polymorphism.ship.Ship;

public class CargoShip extends Ship {
    protected int tonnage;

    public CargoShip(String name, String year, int tonnage) {
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
