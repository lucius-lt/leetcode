// Last updated: 7/16/2026, 1:08:32 AM
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum=0;
        int m=0;
       // int[] max=new int[satisfaction.length];

        for(int i =satisfaction.length-1;i>=0;i--){
            sum+=satisfaction[i];
            if(sum>0){
               m+=sum;
            }
            else{
                 break;
            }
        }
        return m;
    }
}