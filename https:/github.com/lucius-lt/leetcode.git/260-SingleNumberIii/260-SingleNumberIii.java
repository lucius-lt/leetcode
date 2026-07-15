// Last updated: 7/16/2026, 1:09:58 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // Step 1: XOR all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find rightmost set bit
        int diffBit = xor & (-xor);

        int num1 = 0;
        int num2 = 0;

        // Step 3: Divide into two groups
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}
