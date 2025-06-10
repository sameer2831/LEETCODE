class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        int maxOdd=0;
        int minEven=s.length();
        for(int i=0;i<26;i++)
        {
            if(freq[i]%2==0 && freq[i]>0)
            {
                minEven=Math.min(freq[i],minEven);
            }
            else
            {
                maxOdd=Math.max(freq[i],maxOdd);
            }
        }
        //System.out.println(minEven +"  "+maxOdd);
        return maxOdd-minEven;
    }
}