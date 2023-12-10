import java.util.List;

public class Solution {

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder acroynm = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            acroynm.append(words.get(i).charAt(0));
        }
        return acroynm.toString().equals(s);
    }
}
