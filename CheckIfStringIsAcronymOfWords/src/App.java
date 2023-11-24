import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<String>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        System.out.println(Solution.isAcronym(words, "abc"));
    }
}
