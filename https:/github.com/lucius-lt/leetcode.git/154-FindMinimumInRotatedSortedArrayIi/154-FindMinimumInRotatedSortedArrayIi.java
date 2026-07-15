// Last updated: 7/16/2026, 1:10:47 AM
class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]) left=mid+1;
            else if(nums[mid]<nums[right]) right=mid;
        else //nums[mid]==nums[right]
        {
          right--;
        }
        }
        return nums[left];
    }
}