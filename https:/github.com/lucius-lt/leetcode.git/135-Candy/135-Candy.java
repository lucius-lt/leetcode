// Last updated: 7/16/2026, 1:11:00 AM
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies =new int[n];
        Arrays.fill(candies,1);
        //form left to right
        for(int i =1;i<n;i++){
            if(ratings[i]>ratings[i-1]) candies[i]= candies[i-1]+1;
        }
        //from right to left
        for(int i =n-2;i>-1;i--){
            if(ratings[i]>ratings[i+1]) {
                candies[i]= Math.max(candies[i],candies[i+1]+1);
                }
        }
        int total_candies=0;
        for(int candy:candies){
            total_candies+=candy;
        }
        return total_candies;
    }
}