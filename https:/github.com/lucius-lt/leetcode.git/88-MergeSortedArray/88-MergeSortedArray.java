// Last updated: 7/16/2026, 1:11:44 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int count=0;
        for(int i=0;i<m;i++){
            result[count++]=nums1[i];
           // count++;
        }
        for(int i =0;i<n;i++){
            result[count++]=nums2[i];
           // count++;
        }
        Arrays.sort(result);

        for(int i=0;i<nums1.length;i++){
            nums1[i]=result[i];
        }
    }
}