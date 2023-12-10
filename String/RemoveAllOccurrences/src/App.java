import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(removeOccurrences("abcdsadasabc", "abc"));
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder string = new StringBuilder(s);

        for (int i = 0; i <= string.length() - part.length(); i++) {
            StringBuilder partComparer = new StringBuilder();
            int k = i;
            while (k < i + part.length()) {
                partComparer.append(string.charAt(k));
                k++;
            }

            if (partComparer.toString().equals(part)) {
                string.delete(i, i + part.length());
                return removeOccurrences(string.toString(), part);
            }
        }
        return string.toString();

    }

}
