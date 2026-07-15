// Last updated: 7/16/2026, 1:08:19 AM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1=word1.length;
        int w2=word2.length;
        int i=0,j=0;
        int c1=0,c2=0;

        while(i<word1.length&&j<word2.length){
            char p1=word1[i].charAt(c1);
            char p2=word2[j].charAt(c2);
            if(p1!=p2) return false;
            c1++;
            c2++;
            if(c1==word1[i].length()){
                i++;
                c1=0;
            }
            if(c2==word2[j].length()){
                j++;
                c2=0;
            }
        }
        return i==word1.length&&j==word2.length;
    }
}