// Last updated: 7/17/2026, 12:58:04 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int currentSum=0;
        int ans=0;
        map.put(0,1);
        for(int i =0;i<nums.length;i++){
            currentSum+=nums[i];
            int need=currentSum-k;
            if(map.containsKey(need)){
                ans+=map.get(need);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return ans;
    }
}