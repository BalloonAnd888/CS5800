package HW8.StateChain.src.test.java;

import HW8.StateChain.src.main.java.org.Snack;
import HW8.StateChain.src.main.java.org.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void testGetSnack() {
        VendingMachine vm = new VendingMachine();
        Snack coke = new Snack("Coke", 3.0, 5);
        vm.addSnack(coke);
        vm.selectSnack(coke);

        assertEquals("Coke", vm.getSnack().getName());
        assertEquals(3.0, vm.getSnack().getPrice(), 0);
        assertEquals(5, vm.getSnack().getQuantity());
    }

    @Test
    public void testGetMoney() {
        VendingMachine vm = new VendingMachine();
        vm.insertMoney(5.0);

        assertEquals(5.0, vm.getMoney(), 0);
    }
}
