// Last updated: 7/16/2026, 1:09:12 AM
class Solution {
    public boolean judgeCircle(String moves) {
        //U-> y+1
        //D->y-1
        //R -> x+1
        // L -> x-1
        int x=0,y=0;
        for(char c:moves.toCharArray()){
            if(c=='U') y+=1;
            else if(c=='D') y-=1;
            else if(c=='R') x+=1;
            else if(c=='L') x-=1;
        }
        if(y==0&&x==0) return true; 
        return false;
    }
}