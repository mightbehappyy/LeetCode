package ShuffleString;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] indicies = new int[] { 4, 5, 1, 7, 0, 2, 6, 3 };
        System.out.println(Solution.restoreString("codeleet", indicies));
    }
}
