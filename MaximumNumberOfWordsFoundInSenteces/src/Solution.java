public class Solution {

    public static int mostWordsFound(String[] senteces) {
        int result = 0;
        int currentSum = 0;
        for (int i = 0; i < senteces.length; i++) {
            currentSum = 0;
            for (int j = 0; j < senteces[i].length(); j++) {
                if (senteces[i].charAt(j) == ' ') {
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
