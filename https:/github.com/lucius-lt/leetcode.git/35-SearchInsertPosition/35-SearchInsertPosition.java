// Last updated: 7/16/2026, 1:12:23 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
       // int ans=-1;
       if(nums[nums.length-1]<target) return nums.length;
        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid =(left+right)/2;
            if(target<=nums[mid]) right=mid;
            else left=mid+1;

        }
        return right;
    }
}