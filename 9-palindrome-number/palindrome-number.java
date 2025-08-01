class Solution {
    public boolean isPalindrome(int x) {
        String rev=Integer.toString(x);
        for(int i=0;i<rev.length()/2;i++)
        {
            if(rev.charAt(i)==rev.charAt(rev.length()-i-1))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}