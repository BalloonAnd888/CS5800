package polymorphism.cruiseship;

import polymorphism.ship.Ship;

public class CruiseShip extends Ship {
    protected int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers) {
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
