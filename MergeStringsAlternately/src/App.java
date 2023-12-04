public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int loopLength = 0;
        if (word1.length() > word2.length()) {
            loopLength = word1.length();
        } else {
            loopLength = word2.length();
        }

        for (int i = 0; i < loopLength; i++) {
            if (i < word1.length() && (word1.charAt(i) != ' ')) {
                result.append(word1.charAt(i));

            }

            if (i < word2.length() && (word2.charAt(i) != ' ')) {
                result.append(word2.charAt(i));
            }

        }

        return result.toString();
    }
}
