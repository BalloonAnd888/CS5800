package HW4.Factory.src.test.java;

import HW4.Factory.src.main.java.org.CarbFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarbFactoryTest {
    CarbFactory carbFactory = new CarbFactory();

    @Test
    public void testGetInstance() {
        CarbFactory instance1 = carbFactory.getInstance();
        CarbFactory instance2 = carbFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testGetOption() {
        List<String> paleoCarbs  = Arrays.asList("Pistachio");
        String option = carbFactory.getOption("Paleo");
        assertTrue(paleoCarbs .contains(option));

    }
}
