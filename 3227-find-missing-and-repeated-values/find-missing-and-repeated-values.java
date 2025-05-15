class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[] nums=new int[row*col];
        int[] res=new int[2];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                nums[grid[i][j]-1]++;
                if(nums[grid[i][j]-1]>1)
                {
                    res[0]=grid[i][j];
                }
                
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                res[1]=i+1;
            }
        }
        return res;
    }
}