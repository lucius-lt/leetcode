// Last updated: 7/16/2026, 1:09:33 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] count=new int[26];
        for(int i : s1.toCharArray()){
            count[i-'a']++;}
        int right=0,left=0;
        while(right<s2.length()){
            count[s2.charAt(right)-'a']--;
            right++;
            if(right-left==s1.length()) {
            if(allZeros(count)) return true;
            count[s2.charAt(left)-'a']++;
            left++; }}
        return false;}
    static boolean allZeros(int[] count){
        for(int i :count){
            if(i!=0)return false;
        }
        return true; }}