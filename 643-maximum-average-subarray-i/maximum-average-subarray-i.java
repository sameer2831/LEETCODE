class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=0;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[i-k]; // remove element leaving the window
            sum+=nums[i]; // add new element in the window
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}