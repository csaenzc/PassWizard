package org.example;

import java.util.Collection;
import java.util.HashMap;


public class Keys {

    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};
    String[] key = {"A4", "3g", "L0", "M2", "Z#", "R4", "O9", "P0", "M9", "r1", "o4", "s0", "r%", "o!", "9L", "0P", "MM", "op", "45",
            "t5", "%4", "04", "41", "p1", "o)", "45"};
    HashMap<Character, String> keys = new HashMap<Character, String>();

    public void createKeys() {
        for (int i = 0; i < key.length; i++) {
            keys.put(letters[i], key[i]);
        }
    }

    public String getKey(char ind) {
        return keys.get(ind);
    }

    //public Collection<String> getKey() {
    //    createKeys();
    //    return keys.values();
    //}
}
