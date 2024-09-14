package polymorphism;

import polymorphism.ship.Ship;
import polymorphism.cargoship.CargoShip;
import polymorphism.cruiseship.CruiseShip;

public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Blue Horizon", "1995");
        ships[1] = new CruiseShip("Paradise Voyager", "2005", 3000);
        ships[2] = new CargoShip("Titan Freight", "2000", 10000);

        for (Ship s : ships) {
            s.print();
        }
    }
}
