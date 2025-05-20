class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
int n = nums.length;
        int[] delta = new int[n + 1];

        // Apply range increments using difference array
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            delta[l]++;
            if (r + 1 < n) delta[r + 1]--;
        }

        // Build prefix sum array to get final increment count at each index
        int[] newDelta = new int[n];
        newDelta[0] = delta[0];
        for (int i = 1; i < n; i++) {
            newDelta[i] = newDelta[i - 1] + delta[i];
        }

        // Apply the reverse transformation
        for (int i = 0; i < n; i++) {
            int reduced = nums[i] - newDelta[i];
            if (reduced > 0) return false;
        }

        return true;
    }
}