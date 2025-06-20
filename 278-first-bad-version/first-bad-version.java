/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int result=0;
        if(n==1) return 1;
        int low=1,high=n,mid;
        while(high >=low)
        {
            mid = low + ((high - low) / 2);
            if(isBadVersion(mid))
            {
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return result;
    }
}