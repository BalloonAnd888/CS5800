package HW8.StateChain.src.main.java.org;

public class SelectingSnackState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Reset to idle.");
    }

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack.");
        System.out.println("Your selection: " + vendingMachine.getSnack().getName());
        vendingMachine.setState(new WaitingForMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack and insert money.");
    }
}
