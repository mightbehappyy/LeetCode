import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(areOccurencesEqual("abcdefghijklmnopqrstuvwxyzz"));
    }

    public static boolean areOccurencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char baseChar = 'a';
        for (int i = 0; i < 26; i++) {
            map.put(baseChar, 0);
            baseChar++;

        }
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            }

        }
        System.out.println(map);

        boolean isEqual = true;
        ArrayList<Integer> values = new ArrayList<>();
        for (int k = 0; k < map.values().size(); k++) {
            if (Integer.parseInt(map.values().toArray()[k].toString()) != 0) {
                values.add(Integer.parseInt(map.values().toArray()[k].toString()));
            }

        }

        int compareValue = values.get(0);
        for (int l = 1; l < values.size(); l++) {
            if (values.get(l) != compareValue) {
                isEqual = false;
            }
        }

        return isEqual;
    }
}
