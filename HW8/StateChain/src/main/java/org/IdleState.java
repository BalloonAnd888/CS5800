package HW8.StateChain.src.main.java.org;

public class IdleState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Welcome!");
        vendingMachine.setState(new SelectingSnackState());
    }

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack.");
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
