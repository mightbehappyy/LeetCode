public class Solution {
    public static int scoreOfParentheses(String s) {
        int score = 0;
        int opened = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                opened++;
            } else {
                opened--;
                if (s.charAt(i - 1) == '(') {
                    score += Math.pow(2, opened);
                }
            }
        }
        return score;
    }
}
