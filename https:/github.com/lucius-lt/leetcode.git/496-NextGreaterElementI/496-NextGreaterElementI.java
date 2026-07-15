// Last updated: 7/16/2026, 1:09:36 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] Nextgreater = new int[nums1.length];
       int a=0;
        for(int i =0;i<nums1.length;i++){
            int check = nums1[i];
            int index= presentInArray(check,nums2);
           Nextgreater[i]=-1;
            for(int j=index;j<nums2.length;j++){
                if(nums2[j]>check){
                    Nextgreater[i]=nums2[j];
                    break;
                }
                //else Nextgreater[i]=-1;
               
            }
            
        }
        return Nextgreater;
    }
    public int presentInArray(int check, int[] nums2){
      for(int i =0;i<nums2.length;i++){
        if(check == nums2[i])  return i;
      }
      return -1;
    }
}