// Last updated: 7/16/2026, 1:08:22 AM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n =piles.length/3;
        int right=piles.length-2;
        int result=0;
        for(int i =0;i<n;i++){
            result+=piles[right];
            right-=2;
        }
        return result;
    }
}