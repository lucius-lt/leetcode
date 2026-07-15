// Last updated: 7/16/2026, 1:08:29 AM
class Solution {
    public int maxVowels(String s, int k) {
        int max = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1) {
                count++;
            }

            if (i >= k && "aeiou".indexOf(s.charAt(i - k)) != -1) {
                count--;
            }

            if (i >= k - 1) {
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
