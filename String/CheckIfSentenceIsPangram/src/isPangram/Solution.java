package isPangram;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static boolean checkIfPangram(String sentence) {
        ArrayList<Character> result = new ArrayList<>();
        char value = 'a';

        for (char i : sentence.toCharArray()) {
            result.add(i);
        }

        for (int j = 0; j <= sentence.length(); j++) {

            if (!result.contains(value)) {
                return false;
            }
            if (value == 'z') {
                value = 'a';
            } else {
                value++;
            }
        }
        return true;
    }
}
