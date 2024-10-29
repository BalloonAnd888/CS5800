package HW4.Factory.src.test.java;

import HW4.Factory.src.main.java.org.ProteinFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProteinFactoryTest {
    ProteinFactory proteinFactory = new ProteinFactory();

    @Test
    public void testGetInstance() {
        ProteinFactory instance1 = proteinFactory.getInstance();
        ProteinFactory instance2 = proteinFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testGetOption() {
        List<String> nutAllergyProteins = Arrays.asList("Fish", "Chicken", "Beef", "Tofu");
        String option = proteinFactory.getOption("Nut Allergy");
        assertTrue(nutAllergyProteins.contains(option));

    }
}
