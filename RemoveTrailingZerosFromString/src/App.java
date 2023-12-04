public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(removeTrailingZeros("51230100"));
    }

    public static String removeTrailingZeros(String num) {
        StringBuilder result = new StringBuilder();
        boolean isTrailingZero = true;
        for (int i = num.length() - 1; i > -1; i--) {
            if (!isTrailingZero) {
                result.append(num.charAt(i));
            } else {
                if (num.charAt(i) != '0') {
                    isTrailingZero = false;
                    result.append(num.charAt(i));
                }
            }

        }
        return result.reverse().toString();
    }
}
