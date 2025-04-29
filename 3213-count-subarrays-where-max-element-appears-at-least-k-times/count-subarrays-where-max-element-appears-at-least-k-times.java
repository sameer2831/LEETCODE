class Solution {
    public long countSubarrays(int[] nums, int k) {
        long res=0;
        int n=nums.length;
        int maxVal=0;
        for (int v : nums) maxVal = Math.max(maxVal, v);
        int left=0,count=0;
        for(int right=0;right<n;right++)
        {
            if(maxVal==nums[right]) count++;
            while(count>= k)
            {
                if(nums[left]== maxVal) count--;
                left++;
            }
            res+=left;

        }
        return res;
    }
}