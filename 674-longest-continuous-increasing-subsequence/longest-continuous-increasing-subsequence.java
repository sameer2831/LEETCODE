class Solution {
    public int findLengthOfLCIS(int[] nums) {
        //Arrays.sort(nums);
        int res=1,len=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                len++;
                if(res<len)
                {
                    res=len;
                }
            }
            else{
                len=1;
            }
        }
        return res;
    }
}