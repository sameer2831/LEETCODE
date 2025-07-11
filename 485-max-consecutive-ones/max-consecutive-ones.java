class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int start=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                start=i;
            }
            maxOnes=Math.max(maxOnes, i-start);
        }
        return maxOnes;
    }
}