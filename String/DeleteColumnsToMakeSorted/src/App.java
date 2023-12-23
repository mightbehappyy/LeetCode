public class App {
    public static void main(String[] args) throws Exception {
        String[] test = { "a", "b" };
        System.out.println(minDeletionSize(test));
    }

    public static int minDeletionSize(String[] strs) {

        for (int i = 0; i < strs.length; i++) {
            System.out.println("i" + i);
            for (int j = 0; j < strs[i].length(); j++) {
                char a = strs[i].charAt(i);
                System.out.println("j" + j);
                System.out.println(strs[i].charAt(j));
            }
        }
        return 0;
    }
}
