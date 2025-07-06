class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        double result=nums[r];
        while(l<r)
        {
            double sum=nums[l]+nums[r];
            double avg=sum/2;
            result=Math.min(result,avg);
            l++;
            r--;
        }
        return result;
    }
}