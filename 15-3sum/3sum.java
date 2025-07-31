class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]>0) break;
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k )
            {
                int total=nums[i]+nums[j]+nums[k];
                if(total>0) k--;
                else if(total<0) j++;
                else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k)
                    {
                        j++;
                    }
                }
            }
        }
        return res;
    }
}