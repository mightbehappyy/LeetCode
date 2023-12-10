import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(reservePrefix("abcd", 'z'));
    }

    public static String reservePrefix(String word, char ch) {
        StringBuilder restOfWord = new StringBuilder();
        StringBuilder prefix = new StringBuilder();
        boolean passed = false;
        for (int i = 0; i < word.length(); i++) {
            if (passed) {
                restOfWord.append(word.charAt(i));
            } else {
                prefix.append(word.charAt(i));
            }
            if (word.charAt(i) == ch) {
                passed = true;
            }
        }
        if (!passed) {
            return word;
        } else {
            return (prefix.reverse().append(restOfWord)).toString();
        }

    }
}
