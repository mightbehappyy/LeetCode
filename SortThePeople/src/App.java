import java.util.TreeMap;

public class App {
    public static 
    void main(String[] args) throws Exception {
        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };
        sortPeople(names, heights);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> namesAndHeights = new TreeMap<>();

        for (int i = 0; i < names.length; i++) {
            namesAndHeights.put(heights[i], names[i]);
        }

        return namesAndHeights.descendingMap().values().toArray(new String[names.length]);
    }
}
