// Last updated: 7/16/2026, 1:10:51 AM
class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (int i =words.length-1;i>=0;i--){
            sb.append(words[i]);
            if (i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}