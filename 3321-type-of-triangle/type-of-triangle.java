class Solution {
    public String triangleType(int[] nums) {
        
        String[] res={"equilateral","isosceles","scalene"};
        int a=nums[0],b=nums[1],c=nums[2];
        if(!(a+b>c && b+c>a && c+a>b))
        {
            return "none";
        }
        if(a==b && a==c)
        {
            return res[0];
        }
        else if(a!=b && b!=c && a!=c)
        {
            return res[2];
        }
        else{
            return res[1];
        }
        
    }
}