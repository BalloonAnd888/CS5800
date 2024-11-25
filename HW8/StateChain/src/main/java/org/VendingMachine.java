package HW8.StateChain.src.main.java.org;

import java.util.ArrayList;

public class VendingMachine {
    private StateOfVendingMachine state;
    private Snack snack;
    private double money;
    private SnackDispenseHandler snackDispenseHandler;
    private ArrayList<Snack> snacks;

    public VendingMachine() {
        this.state = new IdleState();
        this.snack = null;
        this.money = 0;
        this.snacks = new ArrayList<>();
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public SnackDispenseHandler getSnackDispenseHandler() {
        return snackDispenseHandler;
    }

    public void setSnackDispenseHandler(SnackDispenseHandler snackDispenseHandler) {
        this.snackDispenseHandler = snackDispenseHandler;
    }

    public ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Snack> snacks) {
        this.snacks = snacks;
    }

    public void addSnack(Snack snack) {
        this.snacks.add(snack);
    }

    public void idle() {
        getState().idle(this);
    }

    public void selectSnack(Snack snack) {
        this.setSnack(snack);
        getState().selectSnack(this);
    }

    public void insertMoney(double money) {
        this.setMoney(money);
        getState().insertMoney(this);
    }

    public void dispenseSnack() {
        getState().dispenseSnack(this);
    }
}
