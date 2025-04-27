class Solution {
    public int findClosest(int x, int y, int z) {
        int timeX=Math.abs(z-x);
        int timeY=Math.abs(z-y);
        if(timeX<timeY)
        {
            return 1;
        }
        else if(timeX>timeY)
        {
            return 2;
        }
        else{
            return 0;
        }
        
    }
}