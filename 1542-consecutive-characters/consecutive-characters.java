class Solution {
    public int maxPower(String s) {
        int res=1,length=1;
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                length++;
                res=Math.max(res,length);
            }
            else{
                length=1;

            }
        }
        return res;
    }
}