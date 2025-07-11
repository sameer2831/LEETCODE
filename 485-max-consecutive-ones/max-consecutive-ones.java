class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int len=0;
        int n=nums.length;
        if(n==0) return 0;
        
        for(int i:nums)
        {
            if(i==1)
            {
                len++;
                res=Math.max(res,len);
            }
            else{
                len=0;
            }
        }
        return res;
    }
}