
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(halvesAreAlike("book"));
    }

    public static boolean halvesAreAlike(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        int i = 0;
        int j = s.length() - 1;
        int right = 0;
        int left = 0;
        while (i < j) {
            for (int k = 0; k < vowels.length; k++) {
                if (s.charAt(i) == vowels[k]) {
                    left++;
                }
                if (s.charAt(j) == vowels[k]) {
                    right++;
                }
            }
            i++;
            j--;
        }

        return right == left;
    }
}
