// Last updated: 7/16/2026, 1:08:26 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=nums[0];
        int[] arr=new int[nums.length];
        arr[0]=sum;
        for(int i =1;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}