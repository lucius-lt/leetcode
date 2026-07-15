// Last updated: 7/16/2026, 1:12:30 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n =nums.length;
        int count=0;
        for(int i =0;i<n;i++){
            if(nums[i]!=val) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
        
    }
}