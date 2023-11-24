
public class Solution {

    public static String truncateSentence(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {
            result.append(s.split(" ")[i]);
            if (i != k - 1) {
                result.append(" ");
                System.out.println("espaço");
            }
        }

        return result.toString();
    }
}
