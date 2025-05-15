class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res=new ArrayList<String>();
        int curr=0;
        res.add(words[curr]);
        for(int i=1;i<groups.length;i++)
        {
            if(groups[i]!=groups[curr])
            {
                res.add(words[i]);
                curr=i;
            }
        }
        return res;
    }
}