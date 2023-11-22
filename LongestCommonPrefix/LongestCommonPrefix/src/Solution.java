public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int menorString = 0;
        String prefixoComum = "";

        char tempChar = ' ';
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        for (int k = 0; k < strs.length; k++) {
            if (k == 0) {
                menorString = strs[k].length();
            } else {
                if (menorString > strs[k].length()) {
                    menorString = strs[k].length();
                }
            }
        }

        for (int j = 0; j < menorString; j++) {

            for (int i = 0; i < strs.length; i++) {
                if (i == 0) {
                    tempChar = strs[i].charAt(j);
                } else {
                    if (strs[i].charAt(j) != tempChar) {
                        return prefixoComum;
                    } else if (strs[i].charAt(j) == tempChar && i == strs.length - 1) {
                        prefixoComum += tempChar;
                    }
                }
            }
        }
        return prefixoComum;
    }
}
