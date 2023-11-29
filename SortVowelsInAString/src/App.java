import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(sortVowels("lEetcOde"));
    }

    public static String sortVowels(String s) {
        ArrayList<Character> sortedArray = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Character tempVowel = s.charAt(i);
            if (tempVowel == 'A' || tempVowel == 'E' ||
                    tempVowel == 'I' || tempVowel == 'O' ||
                    tempVowel == 'U' || tempVowel == 'a' ||
                    tempVowel == 'e' || tempVowel == 'i' ||
                    tempVowel == 'o' || tempVowel == 'u') {
                positions.add(i);
                sortedArray.add(tempVowel);

            }
        }
        Collections.sort(sortedArray);
        for (int k = 0; k < s.length(); k++) {
            result.append(s.charAt(k));
        }
        for (int j = 0; j < sortedArray.size(); j++) {
            result.setCharAt(positions.get(j), sortedArray.get(j));
        }

        return result.toString();
    }
}
