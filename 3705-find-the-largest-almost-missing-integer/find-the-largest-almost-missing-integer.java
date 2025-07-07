class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // Edge case: k is too large or invalid
        if (k <= 0 || k > n) {
            return -1;
        }

        // minStartIdx: stores the minimum starting index of a k-sized subarray
        // that contains a specific value.
        // maxStartIdx: stores the maximum starting index of a k-sized subarray
        // that contains a specific value.
        Map<Integer, Integer> minStartIdx = new HashMap<>();
        Map<Integer, Integer> maxStartIdx = new HashMap<>();

        // Iterate through each element in nums to determine the range of
        // subarray starting positions for each unique number.
        for (int j = 0; j < n; j++) {
            int value = nums[j];

            // A subarray of size k containing nums[j] can start at index 'i'
            // where i <= j < i + k.
            // Rearranging: j - k + 1 <= i <= j.

            // Also, the subarray must be within array bounds: 0 <= i <= n - k.
            
            // So, the first possible start index for a k-sized subarray containing nums[j]
            // is max(0, j - k + 1).
            int currentMinPossibleStart = Math.max(0, j - k + 1);

            // The last possible start index for a k-sized subarray containing nums[j]
            // is min(j, n - k).
            int currentMaxPossibleStart = Math.min(j, n - k);

            // Update the overall min and max start indices for 'value'
            minStartIdx.put(value, Math.min(minStartIdx.getOrDefault(value, Integer.MAX_VALUE), currentMinPossibleStart));
            maxStartIdx.put(value, Math.max(maxStartIdx.getOrDefault(value, Integer.MIN_VALUE), currentMaxPossibleStart));
        }

        // finalCounts: stores how many distinct k-sized subarrays each number appears in.
        Map<Integer, Integer> finalCounts = new HashMap<>();
        
        // Iterate through all unique values found in nums (keys of minStartIdx map)
        Set<Integer> uniqueValues = minStartIdx.keySet(); // Could use maxStartIdx.keySet() too
        for (int value : uniqueValues) {
            int minS = minStartIdx.get(value);
            int maxS = maxStartIdx.get(value);
            
            // The number of distinct subarrays of size k that 'value' appears in
            // is the range of valid starting indices plus one.
            int count = maxS - minS + 1;
            finalCounts.put(value, count);
        }

        int largestAlmostMissing = -1;

        // Find the largest integer that appears in exactly one subarray of size k.
        for (Map.Entry<Integer, Integer> entry : finalCounts.entrySet()) {
            if (entry.getValue() == 1) {
                largestAlmostMissing = Math.max(largestAlmostMissing, entry.getKey());
            }
        }

        return largestAlmostMissing;
    }

}