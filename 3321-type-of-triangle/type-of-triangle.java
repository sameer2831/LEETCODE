class Solution {
    public String triangleType(int[] nums) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        int a=nums[0],b=nums[1],c=nums[2];
        if(!(a+b>c && b+c>a && c+a>b))
        {
            return "none";
        }
        String[] res={"equilateral","isosceles","scalene"};
        for(int i=0;i<3;i++)
        {
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }
        return res[maps.size()-1];
        
    }
}