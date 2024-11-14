package HW6.Flyweight.src.test.java;

import HW6.Flyweight.src.main.java.org.Character;
import HW6.Flyweight.src.main.java.org.CharacterFlyweightFactory;
import HW6.Flyweight.src.main.java.org.Document;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocumentTest {
    @Test
    public void testAddCharacter() {
        Document document = new Document();
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Arial", "Blue", 14)));
        document.addCharacter(new Character('T', factory.getCharacterFlyweight("Verdana", "Black", 12)));

        List<Character> characters = document.getCharacters();
        assertEquals(2, characters.size());
        assertEquals('L', characters.get(0).getCharacter());
        assertEquals("Arial", characters.get(0).getProperties().getFont());
        assertEquals(14, characters.get(0).getProperties().getSize());
        assertEquals("Blue", characters.get(0).getProperties().getColor());
        assertEquals(12, characters.get(1).getProperties().getSize());
    }

    @Test
    public void testGetCharacter() {
        Document document = new Document();
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Arial", "Blue", 14)));
        document.addCharacter(new Character('T', factory.getCharacterFlyweight("Verdana", "Black", 12)));

        List<Character> characters = document.getCharacters();
        assertEquals('L', characters.get(0).getCharacter());
        assertEquals('T', characters.get(1).getCharacter());
    }

    @Test
    public void testSave() {
        String testFile = "test_document.txt";
        Document document = new Document();
        document.save(testFile);
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Arial", "Blue", 14)));
        document.addCharacter(new Character('T', factory.getCharacterFlyweight("Verdana", "Black", 12)));

        File file = new File(testFile);
        if (file.exists()) {
            assertTrue(file.delete());
        }
    }

    @Test
    public void testLoad() {
        String testFile = "test_document.txt";
        Document document = new Document();
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Arial", "Blue", 14)));
        document.addCharacter(new Character('T', factory.getCharacterFlyweight("Verdana", "Black", 12)));
        document.save(testFile);

        Document load = document.load(testFile);
        List<Character> loadedCharacters = load.getCharacters();

        assertEquals(2, loadedCharacters.size());
        assertEquals('L', loadedCharacters.get(0).getCharacter());
        assertEquals("Verdana", loadedCharacters.get(1).getProperties().getFont());
    }
}
