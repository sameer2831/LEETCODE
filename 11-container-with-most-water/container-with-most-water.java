class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxWater=0;
        int high=0;
        int l=0,r=n-1;
        while(l<r)
        {
            high=Math.min(height[l],height[r]);
            int area=Math.min(height[l],height[r])*(r-l);
            maxWater=Math.max(maxWater,area);
            while(l<r && height[l]<=high)
            {
                l++;
            }
            while(l<r && height[r]<=high){
                r--;
            }
        }
        return maxWater;
    }
}