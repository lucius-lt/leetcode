// Last updated: 7/16/2026, 1:08:34 AM
class Solution {
    public int findNumbers(int[] nums) {
        int even =0;
        for(int i =0;i<nums.length;i++){
            if((int)(Math.log10(nums[i]) + 1)%2==0) even++;
        }
        return even;
    }
     
}
