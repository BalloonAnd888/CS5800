package HW8.StateChain.src.main.java.org;

public class KitKatDispenseHandler extends SnackDispenseHandler{
    public KitKatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("KitKat")) {
            System.out.println("Dispensing KitKat");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}
