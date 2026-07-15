// Last updated: 7/16/2026, 1:10:25 AM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1&&!seen.contains(n)){
            seen.add(n);
            n=sumOfNumber(n);
        }
        return n==1;
    }




     public int sumOfNumber(int n){
       int sum=0;
        while(n!=0){
        int digit =n%10;
        sum+=Math.pow(digit,2);
        n/=10;
        }
        return sum;
    }
}