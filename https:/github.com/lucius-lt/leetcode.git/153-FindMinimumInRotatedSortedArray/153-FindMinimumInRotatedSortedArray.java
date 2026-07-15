// Last updated: 7/16/2026, 1:10:49 AM
class Solution {
    public int findMin(int[] nums) {
     
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

           
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
