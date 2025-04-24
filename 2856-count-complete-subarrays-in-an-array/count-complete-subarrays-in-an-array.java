class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> distinct=new HashSet<>();
        for(int num:nums){
            distinct.add(num);
        }
        int totaldistinct=distinct.size();
        int count=0;
        int n=nums.length;
        for(int i=0;i<=n-totaldistinct;i++)
        {
            Set<Integer> currentset=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                currentset.add(nums[j]);
                if(currentset.size()==totaldistinct)
                {
                    count+=(n-j);
                    break;
                }
            }
        }

        return count;
        
    }
}