package Answer1;

public class Solution2 {

    public static int mostWordsFound(String[] sentences) {
        int result = 0;
        int currentSum = 0;
        for (int i = 0; i < sentences.length; i++) {
            currentSum = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    currentSum++;
                }
            }
            currentSum++;
            if (result == 0) {
                result = currentSum;
            } else if (result < currentSum) {
                result = currentSum;
            }
        }
        return result;
    }
}
