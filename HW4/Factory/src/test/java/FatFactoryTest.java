package HW4.Factory.src.test.java;

import HW4.Factory.src.main.java.org.FatFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FatFactoryTest {
    FatFactory fatFactory = new FatFactory();

    @Test
    public void testGetInstance() {
        FatFactory instance1 = fatFactory.getInstance();
        FatFactory instance2 = fatFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testGetOption() {
        List<String> veganFats = Arrays.asList("Avocado", "Peanuts");
        String option = fatFactory.getOption("Vegan");
        assertTrue(veganFats.contains(option));

    }
}
