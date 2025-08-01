class Solution {
    public boolean isPalindrome(int x) {
        String rev=Integer.toString(x);
        int l=0;
        int r=rev.length()-1;
        while(l<r)
        {
            if(rev.charAt(l)!=rev.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}