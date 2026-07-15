// Last updated: 7/16/2026, 1:07:55 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;

        // Count frequencies
        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        // Sum frequencies of elements having max frequency
        int total = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
