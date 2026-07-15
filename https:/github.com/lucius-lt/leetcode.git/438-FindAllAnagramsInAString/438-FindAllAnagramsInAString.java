// Last updated: 7/16/2026, 1:09:40 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int[] count=new int[26];
       List<Integer> result=new ArrayList<>();
       if(p.length()>s.length()) return result;
       for(int c:p.toCharArray()){
        count[c-'a']++; }
       int right=0,left=0;
      while(right<s.length()){
        count[s.charAt(right)-'a']--;
        right++;
        if(right-left==p.length()){
            if(allZeros(count)){
               result.add(left);}
            count[s.charAt(left)-'a']++;
            left++;}}
       return result;}
    private boolean allZeros(int[] count){
        for(int c:count){
            if(c!=0)return false; }
        return true;}}