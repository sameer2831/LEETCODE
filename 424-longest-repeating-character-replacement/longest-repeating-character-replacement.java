class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> maps=new HashMap<>();
        int n=s.length();
        int l=0,maxF=0;
        int maxLen=0;
        for(int r=0;r<n;r++)
        {
            char c=s.charAt(r);
            maps.put(c,maps.getOrDefault(c,0)+1);
            maxF=Math.max(maxF,maps.get(c));
            while(r-l+1-maxF>k)
            {
                maps.put(s.charAt(l),maps.get(s.charAt(l))-1);
                
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}