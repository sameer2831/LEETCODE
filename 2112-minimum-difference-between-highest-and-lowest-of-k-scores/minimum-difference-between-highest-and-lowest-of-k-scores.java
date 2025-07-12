class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<k || k==1)
        {
            return 0;
        }
        
        int minDiff=nums[k-1]-nums[0];
        for(int i=1;i<=n-k;i++)
        {
            int diff=nums[i+k-1]-nums[i];
            
            minDiff=Math.min(diff,minDiff);
        }
        return minDiff;
    }
}