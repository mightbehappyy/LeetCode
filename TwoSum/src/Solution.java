
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        resultado[0] = i;
                        resultado[1] = j;
                    }
                }
            }
        }
        return resultado;
    }
}