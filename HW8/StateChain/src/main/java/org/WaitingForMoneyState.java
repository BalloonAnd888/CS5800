package HW8.StateChain.src.main.java.org;

public class WaitingForMoneyState implements StateOfVendingMachine {
    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Reset to idle.");
    }

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        System.out.println("Insert money");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        double money = vendingMachine.getMoney();
        double price = vendingMachine.getSnack().getPrice();
        System.out.println("Inserted $" + money);

        if(money >= price) {
            vendingMachine.setState(new DispensingSnackState());
        } else {
            vendingMachine.setState(new IdleState());
            System.out.println("Not enough money! Returning $" + money);
            vendingMachine.setMoney(0);
            vendingMachine.setSnack(null);
        }
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Insert money");
    }
}
