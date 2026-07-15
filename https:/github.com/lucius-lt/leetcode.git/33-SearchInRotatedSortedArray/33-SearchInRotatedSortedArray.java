// Last updated: 7/16/2026, 1:12:20 AM
class Solution {
    public int search(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}