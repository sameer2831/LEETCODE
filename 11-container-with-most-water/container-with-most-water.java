class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int l=0,r=n-1;
        while(l<r)
        {
            int area=Math.min(height[l],height[r])*(r-l);
            maxWater=Math.max(maxWater,area);
            if(height[l]<=height[r])
            {
                l++;
            }
            else{
                r--;
            }
        }
        return maxWater;
    }
}