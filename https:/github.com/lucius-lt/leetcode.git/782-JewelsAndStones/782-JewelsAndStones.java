// Last updated: 7/16/2026, 1:09:03 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] mark=new boolean[128];
        for(char i:jewels.toCharArray()){
            mark[i]=true;
        }
        int count=0;
        for(char i:stones.toCharArray()){
            if(mark[i]) count++;
        }
        return count;
    }
}