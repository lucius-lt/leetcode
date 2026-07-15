// Last updated: 7/16/2026, 1:09:08 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        }
        int leftsum=0;
        for(int i =0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}