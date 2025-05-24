class Solution {
    public int[] applyOperations(int[] nums) {
        int result[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1] && nums[i]!=0)
            {
                nums[i]=nums[i+1]*2;
                result[index]=nums[i];
                index++;
                nums[i+1]=0;
            }
            else if(nums[i]>0)
            {
                result[index]=nums[i];
                index++;
            }

        }
        result[index]=nums[nums.length-1];
        index++;
        while(index<nums.length)
        {
            result[index]=0;
            index++;
        }
        return result;
    }
}