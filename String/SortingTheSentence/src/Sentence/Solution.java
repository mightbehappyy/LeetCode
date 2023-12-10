package Sentence;

public class Solution {

    public static String sortSentence(String s) {
        StringBuilder sortedSentence = new StringBuilder();
        int prevPosition = 0;
        for (int i = 0; sortedSentence.length() <= s.length(); i++) {

            for (String c : s.split(" ")) {

                int value = Integer.parseInt(String.valueOf(c.charAt(c.length() - 1)));

                System.out.println("value: " + value + " " + "prevPosition: " + (prevPosition + 1));
                System.out.println(value == prevPosition + 1);

                if (value == prevPosition + 1) {
                    sortedSentence.append(c.substring(0, c.length() - 1));
                    sortedSentence.append(" ");
                }
                if (prevPosition > s.split(" ").length) {
                    prevPosition = 0;
                } else {
                    prevPosition++;
                }
            }

        }
        return sortedSentence.toString();
    }
}
