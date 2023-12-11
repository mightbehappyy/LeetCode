public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(judgeCircle("LL"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                x++;
            }
            if (moves.charAt(i) == 'L') {
                x--;
            }
            if (moves.charAt(i) == 'U') {
                y++;
            }
            if (moves.charAt(i) == 'D') {
                y--;
            }
        }
        return (x == 0 && y == 0);
    }
}
