// Last updated: 7/16/2026, 1:08:47 AM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        if(n==2) return 1;
        return fib(n-1)+fib(n-2);
    }
}