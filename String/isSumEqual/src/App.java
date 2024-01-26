import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isSumEqual("d", "b", "aaaaae"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character c = 'a';
        Integer  i = 0;
        for (int k = 0; k < 26; k++) {
            map.put(c, i);
            c++;
            i++;
        }
        StringBuilder firstWordToNum = new StringBuilder();
        for (int j = 0; j < firstWord.length(); j++) {
            if (map.get(firstWord.charAt(j)) == 0 && j == 0) {
                
            } else {
                firstWordToNum.append(map.get(firstWord.charAt(j)));    
            }
        }

        StringBuilder secondWordToNum = new StringBuilder();
        for (int l = 0; l < secondWord.length(); l++) {
            if (map.get(secondWord.charAt(l)) == 0 && l == 0) {
                
            } else {
                secondWordToNum.append(map.get(secondWord.charAt(l)));    
            }
            
        }

        StringBuilder targetToNum = new StringBuilder();
        for (int m = 0; m < targetWord.length(); m++) {
            if (map.get(targetWord.charAt(m)) == 0 && m == 0) {
               
            } else {
                targetToNum.append(map.get(targetWord.charAt(m)));
            }
                
        }
        Integer firstNum;
        Integer secNum;
        Integer targetNum;
        if (firstWordToNum.isEmpty()) {
            firstNum = 0;
        } else {
            firstNum = Integer.parseInt(firstWordToNum.toString());
        }

        if (secondWordToNum.isEmpty()) {
            secNum = 0;
        } else {
            secNum = Integer.parseInt(secondWordToNum.toString());
        }

        if (targetToNum.isEmpty()) {
            targetNum = 0;
        } else {
            targetNum = Integer.parseInt(targetToNum.toString());
        }
        System.out.println(firstWordToNum);
        System.out.println(secondWordToNum);
        System.out.println(targetToNum);

        System.out.println(firstNum);
        System.out.println(secNum);
        System.out.println(targetNum);
        return firstNum + secNum == targetNum;
    }
}
