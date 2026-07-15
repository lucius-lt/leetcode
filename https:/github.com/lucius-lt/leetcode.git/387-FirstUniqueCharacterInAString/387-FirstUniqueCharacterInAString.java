// Last updated: 7/16/2026, 1:09:42 AM
class Solution {
    public int firstUniqChar(String s) {
     int charcount[] = new int[26];
     for(int i=0;i<s.length();i++){
        charcount[s.charAt(i)-'a']++;
     }
     for(int i =0;i<s.length();i++){
        if(charcount[s.charAt(i)-'a']==1) return i;

     }
     return -1;
         }
}