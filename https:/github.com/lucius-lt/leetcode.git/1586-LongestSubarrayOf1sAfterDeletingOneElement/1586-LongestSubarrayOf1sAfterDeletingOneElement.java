// Last updated: 7/16/2026, 1:08:28 AM
class Solution {
    public int longestSubarray(int[] nums) {
      int sub=0;
        for(int start=0;start<nums.length;start++){
         int zero=0;
         int end;
         for(end=start;end<nums.length;end++){
            if(nums[end]==0) zero++;
            if(zero>1) break;
         } 
         sub=Math.max(sub,end-start);
        }
        return sub-1;
    }
}