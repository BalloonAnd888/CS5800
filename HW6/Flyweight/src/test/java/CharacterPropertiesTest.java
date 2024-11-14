package HW6.Flyweight.src.test.java;

import HW6.Flyweight.src.main.java.org.CharacterProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterPropertiesTest {
    CharacterProperties properties = new CharacterProperties("Arial", "Blue", 14);

    @Test
    public void testGetFont() {
        assertEquals("Arial", properties.getFont());
    }

    @Test
    public void testGetColor() {
        assertEquals("Blue", properties.getColor());
    }

    @Test
    public void testGetSize() {
        assertEquals(14, properties.getSize());
    }
}
