// Last updated: 7/16/2026, 1:11:46 AM
class Solution {
    public String minWindow(String s, String t) {
         if (s.length() < t.length()) return "";

        // Step 1: Count frequency of each character in t
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sliding window pointers
        int left = 0, right = 0;
        int required = tMap.size(); // number of unique characters needed
        int formed = 0; // how many unique chars currently match the required frequency

        // Store frequency of current window
        Map<Character, Integer> windowMap = new HashMap<>();

        // Result: [window length, left, right]
        int[] ans = {-1, 0, 0};

        // Step 3: Expand the window
        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // If the current char's frequency matches the required frequency in t
            if (tMap.containsKey(c) && windowMap.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            // Step 4: Try to shrink the window from the left while it's valid
            while (left <= right && formed == required) {
                char chLeft = s.charAt(left);

                // Update the smallest window
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                // Shrink from left
                windowMap.put(chLeft, windowMap.get(chLeft) - 1);
                if (tMap.containsKey(chLeft) && windowMap.get(chLeft).intValue() < tMap.get(chLeft).intValue()) {
                    formed--;
                }

                left++;
            }

            // Move right pointer ahead
            right++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}