class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> result=new HashSet<>();
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        while(l<r)
        {
            double sum=nums[l]+nums[r];
            double avg=sum/2;
            result.add(avg);
            l++;
            r--;
        }
        return result.size();
    }
}