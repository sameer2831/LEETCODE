class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result=new ArrayList<String>();
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(words[i].contains(words[j])&& !result.contains(words[j]))
                {
                    result.add(words[j]);
                }
                else if(words[j].contains(words[i]) && !result.contains(words[i]))
                {
                    result.add(words[i]);
                }
            }
        }

        return result;
    }
}