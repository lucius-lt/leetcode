// Last updated: 7/16/2026, 1:07:58 AM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1) return 1;
        int maxlen = 1,inc=1,dec=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc+=1;
                dec=1;
            }else if(nums[i]<nums[i-1]){
                dec+=1;
                inc =1;
            }else{
                dec = 1;
                inc =1;
            }
            maxlen = Math.max(maxlen, Math.max(inc,dec));
        }   
        return maxlen;
    }
}