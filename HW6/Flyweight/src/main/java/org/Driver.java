package HW6.Flyweight.src.main.java.org;

public class Driver {
    public static void main(String[] args) {
        Document document = new Document();
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        document.addCharacter(new Character('H', factory.getCharacterFlyweight("Arial", "Red", 12)));
        document.addCharacter(new Character('E', factory.getCharacterFlyweight("Calibri", "Blue", 14)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Verdana", "Black", 16)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Calibri", "Black", 12)));
        document.addCharacter(new Character('O', factory.getCharacterFlyweight("Arial", "Blue", 14)));
        document.addCharacter(new Character('W', factory.getCharacterFlyweight("Verdana", "Red", 14)));
        document.addCharacter(new Character('O', factory.getCharacterFlyweight("Calibri", "Blue", 16)));
        document.addCharacter(new Character('R', factory.getCharacterFlyweight("Arial", "Black", 12)));
        document.addCharacter(new Character('L', factory.getCharacterFlyweight("Calibri", "Red", 14)));
        document.addCharacter(new Character('D', factory.getCharacterFlyweight("Verdana", "Blue", 16)));
        document.addCharacter(new Character('C', factory.getCharacterFlyweight("Calibri", "Red", 14)));
        document.addCharacter(new Character('S', factory.getCharacterFlyweight("Arial", "Black", 16)));
        document.addCharacter(new Character('5', factory.getCharacterFlyweight("Verdana", "Blue", 12)));
        document.addCharacter(new Character('8', factory.getCharacterFlyweight("Calibri", "Red", 16)));
        document.addCharacter(new Character('0', factory.getCharacterFlyweight("Arial", "Black", 14)));
        document.addCharacter(new Character('0', factory.getCharacterFlyweight("Calibri", "Blue", 12)));

        document.save("HelloWorldCS5800.txt");

        Document load = document.load("HelloWorldCS5800.txt");

        for (Character character : load.getCharacters()) {
            System.out.println("Character: " + character.getCharacter() + ", Font: " + character.getProperties().getFont() + ", Color: " + character.getProperties().getColor() + ", Size: " + character.getProperties().getSize());
        }
    }
}
