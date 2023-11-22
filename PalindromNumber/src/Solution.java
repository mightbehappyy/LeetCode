public class Solution {
    public static boolean isPalindrome(int x) {
        StringBuilder reversed = new StringBuilder();
        String str = String.valueOf(x);
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        if (str.equals(reversed.toString())) {
            return true;
        } else {
            return false;
        }
    }

}
