import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(minimizedStringLength("aaabc"));
    }

    public static int minimizedStringLength(String s) {
        ArrayList<Character> existentCharacter =  new ArrayList<>();
        for(int j = 0; j < s.length(); j ++) {
            if(!isInArray(s.charAt(j), existentCharacter)) {
                existentCharacter.add(s.charAt(j));
            }
        }
        
        return existentCharacter.size();
    }

    public static boolean isInArray(Character c, List<Character> existentCharacter) {
        for(int i = 0; i < existentCharacter.size(); i++) {
            if(existentCharacter.get(i).toString().equals(c.toString())) {
                return true;
            }
        }
        return false;
    }
}
