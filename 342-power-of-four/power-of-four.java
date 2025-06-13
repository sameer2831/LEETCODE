class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<4 && n>1)
        {
            return false;
        }
        while(n>1)
        {
            int rem=n%4;
            if(rem!=0)
            {
                return false;
            }
            n=n/4;
        }
        return n==1;
    }
}