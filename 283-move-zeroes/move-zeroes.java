class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            System.out.println(nums);
        }
        else{
            List<Integer> zeroes=new ArrayList<>();
            int index=0;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                {
                    zeroes.add(i);
                }
                else
                {
                    nums[index]=nums[i];
                    index++;
                }
            }
            for(int i=n-zeroes.size();i<n;i++)
            {
                nums[i]=0;
            }
            System.out.println(nums);
            
        }
        
    }
}