// Last updated: 7/16/2026, 1:08:11 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums==null||nums.length ==0) return 0;
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) currentsum += nums[i];
            else currentsum =nums[i];
            maxsum = Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
}