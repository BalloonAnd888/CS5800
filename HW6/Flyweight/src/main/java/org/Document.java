package HW6.Flyweight.src.main.java.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void save(String fileName) {
        System.out.println("Saving document to file: " + fileName);
        try(FileWriter file = new FileWriter(fileName)) {
            for (Character character : characters) {
                file.write(character.getCharacter() + "," + character.getProperties().getColor() + "," + character.getProperties().getFont() + "," + character.getProperties().getSize() + "\n");
            }
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Document load(String fileName) {
        System.out.println("Loading document from file: " + fileName);
        Document document = new Document();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    char character = parts[0].charAt(0);
                    String color = parts[1];
                    String font = parts[2];
                    int size = Integer.parseInt(parts[3]);

                    CharacterProperties properties = factory.getCharacterFlyweight(font, color, size);
                    document.addCharacter(new Character(character, properties));
                }
            }
            System.out.println("Document loaded successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return document;
    }
}
