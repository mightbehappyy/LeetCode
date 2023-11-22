class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            System.out.println(stone);
            // System.out.println(jewels.indexOf(stone));
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }
        return count;
    }
}
