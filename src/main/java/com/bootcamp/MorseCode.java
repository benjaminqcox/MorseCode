package com.bootcamp;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private static Map<String, Character> morseMap = new HashMap<>();
    static {
       morseMap.put("/", ' ');
       morseMap.put(".-", 'a');
       morseMap.put("-...", 'b');
       morseMap.put("-.-.", 'c');
       morseMap.put("-..", 'd');
       morseMap.put(".", 'e');
       morseMap.put("..-.", 'f');
       morseMap.put("--.", 'g');
       morseMap.put("....", 'h');
       morseMap.put("..", 'i');
       morseMap.put(".---", 'j');
       morseMap.put("-.-", 'k');
       morseMap.put(".-..", 'l');
       morseMap.put("--", 'm');
       morseMap.put("-.", 'n');
       morseMap.put("---", 'o');
       morseMap.put(".--.", 'p');
       morseMap.put("--.-", 'q');
       morseMap.put(".-.", 'r');
       morseMap.put("...", 's');
       morseMap.put("-", 't');
       morseMap.put("..-", 'u');
       morseMap.put("...-", 'v');
       morseMap.put(".--", 'w');
       morseMap.put("-..-", 'x');
       morseMap.put("-.--", 'y');
       morseMap.put("--..", 'z');
       morseMap.put(".----", '1');
       morseMap.put("..---", '2');
       morseMap.put("...--", '3');
       morseMap.put("....-", '4');
       morseMap.put(".....", '5');
       morseMap.put("-....", '6');
       morseMap.put("--...", '7');
       morseMap.put("---..", '8');
       morseMap.put("----.", '9');
       morseMap.put("-----", '0');
    }

    public static String translateFromMorse(String sentence) {
        String[] original = sentence.split(" ");
        StringBuilder translation = new StringBuilder();
        for (String letter : original) {
            translation.append(morseMap.get(letter));
        }
        return translation.toString();
    }
    
}
