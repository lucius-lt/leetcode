// Last updated: 7/16/2026, 1:12:15 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i =1;
        while(true){
            if(!set.contains(i)) return i;
            i++;
        }
    }
}