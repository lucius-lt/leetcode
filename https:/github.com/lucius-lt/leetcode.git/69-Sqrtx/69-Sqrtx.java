// Last updated: 7/16/2026, 1:11:52 AM
class Solution {
    public int mySqrt(int x) {
       int low=1,high=x;
       int ans=0;
       while(low<=high){
        int mid=low+(high-low)/2;
        if((long)mid*mid<=x){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       
       }
        return ans;
    }
}






        /*int ans=-1;
         for(int i =0;i<=x;i++){
            if((long)i*i<=x){
                ans=i;
            }
            else break;
         }
         return ans;*/

         //return (int)Math.sqrt(x);