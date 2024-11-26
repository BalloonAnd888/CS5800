package HW8.StateChain.src.main.java.org;

public interface StateOfVendingMachine {
    void idle(VendingMachine vendingMachine);
    void selectSnack(VendingMachine vendingMachine);
    void insertMoney(VendingMachine vendingMachine);
    void dispenseSnack(VendingMachine vendingMachine);
}
