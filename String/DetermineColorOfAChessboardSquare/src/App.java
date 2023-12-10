import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(squareIsWhite("h3"));
    }

    public static boolean squareIsWhite(String coordinates) {
        char x = coordinates.charAt(0);
        StringBuilder y = new StringBuilder(coordinates.charAt(1));
        HashMap<Character, Integer> map = new HashMap<>();

        y.append(coordinates.charAt(1));
        int comparableYValue = Integer.parseInt(y.toString());

        char base = 'a';
        for (int i = 1; i < 9; i++) {
            map.put(base, i);
            base++;
        }

        if (map.get(x) % 2 == 0 && comparableYValue % 2 == 0 || map.get(x) % 2 != 0 && comparableYValue % 2 != 0) {
            return false;
        } else {
            return true;
        }

    }
}
