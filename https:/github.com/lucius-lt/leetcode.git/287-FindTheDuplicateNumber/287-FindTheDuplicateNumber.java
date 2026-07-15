// Last updated: 7/16/2026, 1:09:51 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return 0;
    }
}