package HW8.StateChain.src.main.java.org;

public class CokeDispenseHandler extends SnackDispenseHandler{
    public CokeDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Coke")) {
            System.out.println("Dispensing Coke");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}
