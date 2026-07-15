// Last updated: 7/16/2026, 1:09:53 AM
class Solution {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;

        while(left<right){
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            

            left++;
            right--;
        }
    }
}