class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int maxDiff=0;
        for(int i=0;i<n;i++)
        {
            int diff=0;
            if(i==(n-1))
            {
                diff=Math.abs(nums[i]-nums[0]);
            }
            else{
                diff=Math.abs(nums[i]-nums[i+1]);
            }
            maxDiff=Math.max(maxDiff,diff);

        }
        return maxDiff;
        
    }
}