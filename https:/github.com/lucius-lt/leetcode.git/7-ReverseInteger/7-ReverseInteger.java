// Last updated: 7/16/2026, 1:12:49 AM
class Solution {
    public int reverse(int x) {
        int sum=0,sign=1;
        if(x<0){
            sign=-1;
            x=-x;
        }
        while(x!=0){
            int temp = x%10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0; // Overflow
            }
            if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0; // Underflow
            }
            sum = sum*10+temp;
            x /=10;
        }
        return sum*sign;
    }
}