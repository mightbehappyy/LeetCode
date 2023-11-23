import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String solution(String command) {
        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.add('G');
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result.add('o');
                } else if (command.charAt(i + 1) == 'a') {
                    result.add('a');
                    result.add('l');
                    i += 2;
                }

            }

        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            resultString.append(result.get(i));
        }

        return resultString.toString();
    }
}