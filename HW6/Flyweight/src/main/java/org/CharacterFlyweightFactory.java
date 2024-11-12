package HW6.Flyweight.src.main.java.org;

import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private final Map<String, CharacterProperties> characterFlyweight = new HashMap<String, CharacterProperties>();

    public CharacterProperties getCharacterFlyweight(String font, String color, int size) {
        String key = font + color + size;

        if(!characterFlyweight.containsKey(key)) {
            characterFlyweight.put(key, new CharacterProperties(font, color, size));
        }
        return characterFlyweight.get(key);
    }
}
