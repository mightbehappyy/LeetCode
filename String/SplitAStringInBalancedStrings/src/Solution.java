import java.util.HashMap;

public class Solution {

    public static int balancedStringSplit(String s) {
        int right = 0, left = 0, result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                right++;
            } else {
                left++;
            }
            if (right == left) {
                result++;
            }
        }
        return result;
    }
}
