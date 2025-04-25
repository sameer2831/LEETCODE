class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxEnding=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                maxEnding=nums[i];
                res=Math.max(res,maxEnding);
            }
            else{
                maxEnding=Math.max(maxEnding+nums[i],nums[i]);
                res=Math.max(res,maxEnding);
            }
            
        }
        return res;
    }
}