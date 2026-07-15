// Last updated: 7/16/2026, 1:09:43 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       HashSet<Integer> set2= new HashSet<>();
       int n =nums1.length;
       int m=nums2.length;
       for(int num:nums1){
        set.add(num);
       }
       for(int num:nums2){
        if(set.contains(num)){
            set2.add(num);
        }
       }
       int[] result = new int[set2.size()];
int k = 0;

for (int num : set2) {
    result[k++] = num;
}

return result;
    }
}