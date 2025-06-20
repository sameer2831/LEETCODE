class NumArray {
    private int[] sum;
    public NumArray(int[] nums) {
        sum=new int[nums.length+1];
        sum[0]=0;
        for(int i=1;i<=nums.length;i++)
        {
            sum[i]=sum[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
      
        return sum[right+1]-sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */