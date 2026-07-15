// Last updated: 7/16/2026, 1:08:43 AM
class Solution {
    public int lastStoneWeightII(int[] stones) {
     
     int sum=0;
     for(int i =0;i<stones.length;i++) sum+=stones[i];
     int target=sum/2;
     boolean[] arr=new boolean[target+1];
     arr[0]=true;
     for(int s:stones){
        for(int j =target;j>=s;j--){
            if(arr[j-s]) arr[j]=true;
        }
     }
     for(int j =target;j>=0;j--){
        if(arr[j]) return sum-2*j;
     }
     return 0;
    }
}