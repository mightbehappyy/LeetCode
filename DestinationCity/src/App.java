import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<List<String>> arrayOfArray = new ArrayList<>();
        List<String> arrayString = new ArrayList<>();
        arrayString.add("London");
        arrayString.add("New York");
        List<String> arrayString2 = new ArrayList<>();
        arrayString2.add("New York");
        arrayString2.add("Lima");
        List<String> arrayString3 = new ArrayList<>();
        arrayString3.add("Lima");
        arrayString3.add("Sao Paulo");

        arrayOfArray.add(arrayString);
        arrayOfArray.add(arrayString2);
        arrayOfArray.add(arrayString3);
        destCity(arrayOfArray);
        System.out.println(arrayOfArray);
    }

    public static String destCity(List<List<String>> paths) {
        HashMap<String, String> result = new HashMap();
        ArrayList<String> destination = new ArrayList<>();
        for (int i = 0; i < paths.size(); i++) {

            for (int j = 0; j < paths.get(i).size() - 1; j++) {
                System.out.println(paths.get(i).get(j));
                result.put(paths.get(i).get(j), paths.get(i).get(j + 1));
                destination.add(paths.get(i).get(j + 1));
            }
        }

        for (int k = 0; k < result.size(); k++) {
            if (!result.containsKey(destination.get(k))) {
                return destination.get(k);
            }
        }
        return "";
    }
}
