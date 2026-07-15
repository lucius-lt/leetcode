// Last updated: 7/16/2026, 1:10:33 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] rotated =new int[n];
        for(int i =0;i<n;i++){
         rotated[(i+k)%n]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }
    }
}