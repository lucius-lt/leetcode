// Last updated: 7/16/2026, 1:10:15 AM
class Solution {
    public int maximalSquare(char[][] matrix) {
     int m =matrix.length,n=matrix[0].length;
     int[][] dp=new int[m][n];
     int maxi=0;
     for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            if(matrix[i][j]=='1'){
                if(i==0||j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
                 maxi=Math.max(maxi,dp[i][j]);
            }
           // else dp[i][j]=0;
           
        }
     } 
     return maxi*maxi;  
    }
}