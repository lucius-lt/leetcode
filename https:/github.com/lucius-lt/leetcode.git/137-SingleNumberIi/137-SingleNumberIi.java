// Last updated: 7/16/2026, 1:10:57 AM
class Solution {
    public int singleNumber(int[] nums) {
        //use hashmap
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i+=3){
            if(nums[i]!=nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    } }
        /*int n =nums.length;
        int[]  freq=new int[n];
        for(int i :nums){
            freq[i]++;
        }
        for(int i =0;i<n;i++){
            if(freq[i]==1)return nums[i];
        }
        return 0;*/

    