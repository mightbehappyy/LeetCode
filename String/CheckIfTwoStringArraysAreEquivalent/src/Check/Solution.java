package Check;

import java.util.Arrays;

public class Solution {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word2).equals(String.join("", word1));
    }
}
