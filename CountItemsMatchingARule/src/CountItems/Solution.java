package CountItems;

import java.util.HashMap;
import java.util.List;

public class Solution {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        int result = 0;

        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
                if (items.get(i).get(map.get(ruleKey)).equals(ruleValue)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
