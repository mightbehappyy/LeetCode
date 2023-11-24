package Decode;

import java.util.HashMap;

public class Solution {

    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap();
        StringBuilder result = new StringBuilder();
        char firstValue = 'a';
        for (char i : key.toCharArray()) {
            if (map.get(i) == null && i != ' ') {
                map.put(i, firstValue);
                firstValue++;
            }
        }

        for (char j : message.toCharArray()) {
            if (j != ' ') {
                result.append(map.get(j));
            } else {
                result.append(' ');
            }
        }
        return result.toString();

    }
    // o(n + m)
}
