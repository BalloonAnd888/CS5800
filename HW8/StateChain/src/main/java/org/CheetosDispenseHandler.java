package HW8.StateChain.src.main.java.org;

public class CheetosDispenseHandler extends SnackDispenseHandler{
    public CheetosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Cheetos")) {
            System.out.println("Dispensing Cheetos");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}
