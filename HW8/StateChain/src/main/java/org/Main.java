package HW8.StateChain.src.main.java.org;

public class Main {
    public static void main(String[] args) {
        Snack coke = new Snack("Coke", 1.99, 5);
        Snack pepsi = new Snack("Pepsi", 1.99, 4);
        Snack cheetos = new Snack("Cheetos", 2.00, 10);
        Snack doritos = new Snack("Doritos", 3.50, 8);
        Snack kitkat = new Snack("Kitkat", 5.00, 5);
        Snack snickers = new Snack("Snickers", 4.50, 1);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(snickers);

        System.out.println("Buying Pepsi");
        vendingMachine.idle();
        vendingMachine.selectSnack(pepsi);
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        System.out.println("\nBuying Snickers");
        vendingMachine.idle();
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();

        System.out.println("\nBuying Kitkat");
        vendingMachine.idle();
        vendingMachine.selectSnack(kitkat);
        vendingMachine.insertMoney(3);
        vendingMachine.dispenseSnack();

        System.out.println("\nBuying Snickers");
        vendingMachine.idle();
        vendingMachine.selectSnack(snickers);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
    }
}

