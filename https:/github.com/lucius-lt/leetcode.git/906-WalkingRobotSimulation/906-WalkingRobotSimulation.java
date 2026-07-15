// Last updated: 7/16/2026, 1:08:58 AM
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
      int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
      int d=0;
      Set<String> set=new HashSet<>();
      for(int a[]:obstacles){
        set.add(a[0]+","+a[1]);
      }  
      int x=0,y=0;
      int maxc=0;
      for(int k:commands){
        if(k==-2){
            d=(d-1+4)%4;

        }
        else if(k==-1){
            d=(d+1)%4;
        }
        else{
            int dr[]=dir[d];
            for(int i =0;i<k;i++)
            {
                int nx=x+dr[0];
                int ny=y+dr[1];
                if(!set.contains(nx+","+ny)){
                    x=nx;
                    y=ny;
                    maxc=Math.max(maxc,x*x+y*y);
                }
                else break;
            }
        }
      }
      return maxc;
    }
}