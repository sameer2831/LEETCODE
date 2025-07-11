class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalP=1;
        
        int noOf0=0;
        boolean contains0=false;
        int n=nums.length;
        for(int i:nums)
        {
            if(i!=0) totalP*=i;
            else {contains0=true;
            noOf0++;
            }
        }
        
        int result[]= new int[n];

        if(noOf0>1)
        {
            return result;
        }
        if(contains0 )
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0) result[i]=totalP;
                else result[i]=0;
            }
        }
        else{
            for(int i=0;i<n;i++)
            {
                
                result[i]=totalP/nums[i];
            }
        }
        
        return result;

    }
}