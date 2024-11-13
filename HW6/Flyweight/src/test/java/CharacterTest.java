package HW6.Flyweight.src.test.java;

import HW6.Flyweight.src.main.java.org.Character;
import HW6.Flyweight.src.main.java.org.CharacterProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    CharacterProperties properties = new CharacterProperties("Arial", "Black", 14);
    Character character = new Character('L', properties);

    @Test
    public void testGetCharacter() {
        assertEquals('L', character.getCharacter());
    }

    @Test
    public void testGetProperties() {
        assertEquals(properties, character.getProperties());
    }
}
