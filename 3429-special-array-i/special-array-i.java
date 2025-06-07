class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1 || nums.length==0)
        {
            return true;
        }
        if(nums[0]%2==0)
        {
            for(int i=1;i<nums.length;i++)
            {
                if((i%2!=0 && nums[i]% 2 ==0) || (i%2==0 && nums[i]%2!=0))
                {
                    return false;
                }
            }
        }
        else{
            for(int i=1;i<nums.length;i++)
            {
                if((i%2!=0 && nums[i]% 2 !=0) || (i%2==0 && nums[i]%2==0))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}