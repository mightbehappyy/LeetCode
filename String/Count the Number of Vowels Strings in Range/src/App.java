import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String[] words = {"are","amy","u"};

        System.out.println(vowelStrings(words, 0, 2));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int result = 0;
        for(int i = left; i <= right; i++) {
            System.out.println(words[i]);
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                result++;
                }
            }
            return result;
        }
       
    }
