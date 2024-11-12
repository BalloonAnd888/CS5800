package HW6.Flyweight.src.test.java;

import HW6.Flyweight.src.main.java.org.CharacterFlyweightFactory;
import HW6.Flyweight.src.main.java.org.CharacterProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CharacterFlyweightFactoryTest {
    @Test
    public void testGetCharacterFlyweight() {
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        CharacterProperties properties1 = factory.getCharacterFlyweight("Arial", "Red", 12);
        CharacterProperties properties2 = factory.getCharacterFlyweight("Arial", "Red", 12);

        assertEquals(properties1, properties2);
        assertSame(properties1, properties2);
    }
}
