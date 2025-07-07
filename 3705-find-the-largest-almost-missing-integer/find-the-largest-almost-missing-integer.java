class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        int maxNum=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(num>maxNum)
            {
                maxNum=num;
            }
        }
        for(Map.Entry<Integer,Integer> set:freq.entrySet())
        {
            if(set.getValue()==1)
            {
                max=Math.max(set.getKey(),max);
            }
        }
        if(k==n)
        {
            return maxNum;
        }
        if(k==1)
        {
            return max;
        }
        if(k>1 && k<n)
        {
            
           int x =freq.get(nums[0]), y= freq.get(nums[n-1]);
           System.out.println("inside K>1 && K<n x: "+x+" y: "+y );
           if(x>y && y==1)
           {
                    return nums[n-1];
           }
           if(y>x && x==1)
           {
                    return nums[0];
           }
           if(x==y && y==1)
           {
            return Math.max(nums[0],nums[n-1]);
           }
           
        }
        return -1;
    }
}