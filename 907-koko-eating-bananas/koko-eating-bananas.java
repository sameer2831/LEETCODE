class Solution {
    
    public int minEatingSpeed(int[] piles, int h) {
        int maxRate=0;
        for(int p:piles) maxRate=Math.max(maxRate,p);
        int l=1,r=maxRate;
        int result=maxRate;
        while(l<=r)
        {
            int mid=(l+r)/2;
            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / mid);
            }
            if(totalTime<=h)
            {
                result=mid;
                r=mid-1;
            }
            else if(totalTime>h) l=mid+1;
        }
        return result;
    }
}