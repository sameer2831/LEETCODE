class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int n:map.keySet())
        {
            if(map.get(n)==1)
            {
                return n;
            }
        }
        return 0;
    }
}