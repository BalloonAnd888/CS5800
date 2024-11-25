package HW8.StateChain.src.main.java.org;

public class DispensingSnackState implements StateOfVendingMachine{
    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Reset to idle.");
    }

    @Override
    public void selectSnack(VendingMachine vendingMachine) {
        System.out.println("Can not pick another snack");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Can not insert money");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        int quantity = vendingMachine.getSnack().getQuantity();
        double money = vendingMachine.getMoney();

        if(quantity > 0) {
            System.out.println("Dispensing " + vendingMachine.getSnack().getName());
            vendingMachine.getSnack().setQuantity(quantity - 1);
        } else {
            System.out.println(vendingMachine.getSnack().getName() + " is out of stock");
            System.out.println("Returning $" + money);
        }
        vendingMachine.setState(new IdleState());
        vendingMachine.setMoney(0);
        vendingMachine.setSnack(null);
    }
}
