// Last updated: 7/16/2026, 1:10:00 AM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            num =sumOfNumber(num);
        }
        return num;
    }

    public int sumOfNumber(int num){
       int sum=0;
        while(num!=0){
        int digit =num%10;
        sum+=digit;
        num/=10;
        }
        return sum;
    }
}