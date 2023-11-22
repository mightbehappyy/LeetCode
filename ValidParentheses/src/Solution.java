import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean isValid(String s) {
        List<Character> listaDeCaracteres = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                listaDeCaracteres.add(')');
            } else if (c == '[') {
                listaDeCaracteres.add(']');
            } else if (c == '{') {
                listaDeCaracteres.add('}');
            } else if (listaDeCaracteres.isEmpty() || listaDeCaracteres.get(listaDeCaracteres.size() - 1) != c) {
                return false;
            } else if (listaDeCaracteres.get(listaDeCaracteres.size() - 1) == c) {
                listaDeCaracteres.remove(listaDeCaracteres.size() - 1);
            }
        }
        return listaDeCaracteres.isEmpty();
    }
}