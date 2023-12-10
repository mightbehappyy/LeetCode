
public class App {
    public static void main(String[] args) throws Exception {
        String[] words = { "cd", "ac", "dc", "ca", "zz" };
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(reverse(words[j]))) {
                    result++;
                }
            }
        }
        return result;
    }

    public static String reverse(String s) {
        String result = "";
        result += s.charAt(1);
        result += s.charAt(0);

        return result;

    }
}
