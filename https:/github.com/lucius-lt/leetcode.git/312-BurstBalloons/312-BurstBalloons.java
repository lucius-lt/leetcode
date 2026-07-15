// Last updated: 7/16/2026, 1:09:48 AM
class Solution {
   int[][] dp;
    int[] arr;

    public int maxCoins(int[] nums) {

        int n = nums.length;

        // Step 1: add boundaries
        arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }

        // Step 2: memo table
        dp = new int[n + 2][n + 2];

        // initialize with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Step 3: solve
        return solve(1, n);
    }

    int solve(int left, int right) {

        // base case
        if (left > right) return 0;

        // already computed
        if (dp[left][right] != -1) return dp[left][right];

        int max = 0;

        // try every balloon as LAST
        for (int k = left; k <= right; k++) {

            int coins =
                solve(left, k - 1) +
                solve(k + 1, right) +
                arr[left - 1] * arr[k] * arr[right + 1];

            max = Math.max(max, coins);
        }

        return dp[left][right] = max;
    }
}