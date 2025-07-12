class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            //int integer=nums[i];
            if(maps.containsKey(nums[i])&& i-maps.get(nums[i])<=k)
            {
                return true;
            }
            maps.put(nums[i],i);
        }   
        return false;
    }
}