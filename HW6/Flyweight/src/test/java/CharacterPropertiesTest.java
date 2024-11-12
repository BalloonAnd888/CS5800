package HW6.Flyweight.src.test.java;

import HW6.Flyweight.src.main.java.org.CharacterProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterPropertiesTest {
    @Test
    public void testGetFont() {
        CharacterProperties properties = new CharacterProperties("Arial", "Blue", 14);
        assertEquals("Arial", properties.getFont());
    }

    @Test
    public void testGetColor() {
        CharacterProperties properties = new CharacterProperties("Arial", "Blue", 14);
        assertEquals("Blue", properties.getColor());
    }

    @Test
    public void testGetSize() {
        CharacterProperties properties = new CharacterProperties("Arial", "Blue", 14);
        assertEquals(14, properties.getSize());
    }
}
