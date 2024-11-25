package HW8.StateChain.src.main.java.org;

public class PepsiDispenseHandler extends SnackDispenseHandler{
    public PepsiDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Pepsi")) {
            System.out.println("Dispensing Pepsi");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}
