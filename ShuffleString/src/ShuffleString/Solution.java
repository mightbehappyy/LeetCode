package ShuffleString;

public class Solution {

    public static String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder();
        int searchNumber = 0;

        for (int j = 0; result.length() < indices.length; j++) {
            for (int i = 0; i < indices.length; i++) {
                if (indices[i] == searchNumber) {
                    result.append(s.charAt(i));
                    searchNumber++;
                }
            }
        }
        return result.toString();
    }
}
