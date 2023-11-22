class Solution {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i - 1) == '(') {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ')' && s.charAt(i - 1) == '(') {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}