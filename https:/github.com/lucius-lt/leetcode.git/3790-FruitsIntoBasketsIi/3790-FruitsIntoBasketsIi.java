// Last updated: 7/16/2026, 1:08:00 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used=new boolean[fruits.length];
        int unplaced=0;
        boolean placed=false;
        for(int i =0;i<fruits.length;i++){
          placed=false;
          for(int j =0;j<baskets.length;j++){
            if(!used[j]&&baskets[j]>=fruits[i]){
                used[j]=true;
                placed=true;
                break;
            }
          }
          if(placed==false) unplaced++;
        }
        return unplaced;
    }
}