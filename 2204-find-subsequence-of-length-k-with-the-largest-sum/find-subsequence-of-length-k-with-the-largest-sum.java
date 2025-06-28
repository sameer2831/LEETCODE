class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        if(nums.length==k)
        {
            return nums;
        }
        int result[]=new int[k];
        int arrwithIndex[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            arrwithIndex[i]=new int[]{nums[i],i};
        }
        Arrays.sort(arrwithIndex,(a,b)->b[0]-a[0]);
        Arrays.sort(arrwithIndex,0,k,(a,b)->a[1]-b[1]);

        for(int i=0;i<k;i++)
        {
            result[i]=arrwithIndex[i][0];
        }
        return result;
    }
}