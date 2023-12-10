import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        char[] lista = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(lista);
        
    }

    public static void reverseString(char[] s) {
        int j = 0;
        for (int i = s.length - 1; j <= i - 1; i--) {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j++;
        }
        System.out.println(s);
    }
}
