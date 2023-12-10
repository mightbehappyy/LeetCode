public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
    }

    public static int countAsterisks(String s) {
        int result = 0;
        int pair = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|') {
                pair++;
            }
            if ((pair % 2) == 0 && (s.charAt(i) == '*')) {
                result++;
            }
        }
        return result;

    }
}
