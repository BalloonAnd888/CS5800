package HW8.StateChain.src.main.java.org;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public void dispenseSnack(Snack snack) {
        if (next != null) {
            next.dispenseSnack(snack);
        }
    }
}
