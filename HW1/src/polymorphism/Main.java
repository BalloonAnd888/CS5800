package polymorphism;

import polymorphism.ship.Ship;
import polymorphism.cargoship.CargoShip;
import polymorphism.cruiseship.CruiseShip;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship("Bob", "1996");

        Ship cruiseShip = new CruiseShip("Bob", "1996", 5);

        Ship cargoShip = new CargoShip("Bob", "1996", 1);

        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(ship);
        ships.add(cruiseShip);
        ships.add(cargoShip);

        for(Ship s: ships) {
            s.print();
        }
    }
}
