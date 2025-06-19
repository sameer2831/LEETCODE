class Solution {
    public int partitionArray(int[] nums, int k) {
        int[] count = new int[100001];
        for (int num : nums) count[num]++;

        int result = 0;
        int i = 0;
        while (i < count.length) {
            while (i < count.length && count[i] == 0) i++;
            if (i == count.length) break;

            int start = i;
            result++;

            while (i < count.length && i <= start + k) {
                count[i++] = 0;
            }
        }

        return result;
    }
}