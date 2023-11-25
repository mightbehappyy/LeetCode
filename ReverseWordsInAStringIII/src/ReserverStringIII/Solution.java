package ReserverStringIII;

import java.util.ArrayList;

public class Solution {
    public static String reverseWords(String s) {
        String[] splitArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : splitArray) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            result.append(reversedWord);
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
