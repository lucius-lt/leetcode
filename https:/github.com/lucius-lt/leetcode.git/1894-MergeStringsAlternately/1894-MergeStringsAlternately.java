// Last updated: 7/16/2026, 1:08:14 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        char[] res = new char[n1 + n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 || j < n2){
            if(i < n1) res[k++] = word1.charAt(i++);
            if(j < n2) res[k++] = word2.charAt(j++);
        }
        return new String(res);
    }
}