import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };

        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        ArrayList<String> palindromes = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            ArrayList<Boolean> results = new ArrayList<>();
            for (int j = words[i].length() - 1; j > -1; j--) {
                if (words[i].charAt(j) == words[i].charAt((words[i].length() - 1) - j)) {
                    results.add(true);
                }
            }
            if (results.size() == words[i].length()) {
                palindromes.add(words[i]);
            }
        }
        if (palindromes.isEmpty()) {
            return "";
        } else {
            return palindromes.get(0);
        }

    }
}
