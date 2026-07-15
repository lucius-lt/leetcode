// Last updated: 7/16/2026, 1:08:56 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int hi = 0;
        for (int p : piles) {
            hi = Math.max(hi, p);
        }
        while (low < hi) {
            int mid = low + (hi - low) / 2;
            if (hours(piles, mid) <= h) {
                hi = mid;
            } else {
                low = mid + 1;
            }}
        return low;
    }
    int hours(int[] piles, int k) {
        int hour = 0;
        for (int i = 0; i < piles.length; i++) {
            hour += (int)Math.ceil((double)piles[i] / k);
        }
        return hour;  }}