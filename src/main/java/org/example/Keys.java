package org.example;
import java.util.HashMap;

public class Keys {

    private static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};
    private static final String[] values = {"A4", "3g", "L0", "M2", "Z#", "R4", "O9", "P0", "M9", "r1", "o4", "s0", "r%", "o!", "9L", "0P", "MM", "op", "45",
            "t5", "%4", "04", "41", "p1", "o)", "45"};
    private static final HashMap<Character, String> keysMap = new HashMap<>();

    private static void createKeys() {
        for (int i = 0; i < values.length; i++) {
            keysMap.put(letters[i], values[i]);
        }
    }

    public static String getKey(char ind) {
        return keysMap.get(ind);
    }

    public static void initKeys() {
        if(keysMap.isEmpty()) {
            createKeys();
        }
    }

}
