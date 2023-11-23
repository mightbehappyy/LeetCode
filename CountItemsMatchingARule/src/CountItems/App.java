package CountItems;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<List<String>> myArrayList = new ArrayList<>();

        // Adding the inner lists
        myArrayList.add(List.of("phone", "blue", "pixel"));
        myArrayList.add(List.of("computer", "silver", "lenovo"));
        myArrayList.add(List.of("phone", "gold", "iphone"));
        System.out.println(Solution.countMatches(myArrayList, "color", "silver"));
    }
}
