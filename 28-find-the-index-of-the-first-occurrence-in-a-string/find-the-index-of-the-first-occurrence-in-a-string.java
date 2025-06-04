class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length(), n=needle.length();
        for(int i=0;i<=h-n;i++)
        {
            //System.out.println(haystack.substring(i,n));
            if(haystack.substring(i,i+n).equals(needle))
            {
                return i;
            }
            
        }
        return -1;
    }
}