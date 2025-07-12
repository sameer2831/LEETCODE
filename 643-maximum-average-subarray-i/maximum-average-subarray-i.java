class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        double sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        if(n==k)
        {
            return sum/k;
        }
        maxSum=sum;
        for(int i=k;i<n;i++)
        {
            sum-=nums[i-k]; // remove element leaving the window
            sum+=nums[i]; // add new element in the window
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}