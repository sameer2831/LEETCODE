class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(pattern.length() != words.length)
        {
            return false;
        }
        char p[]=pattern.toCharArray();
        Map<Character, String> maps=new HashMap<>();
        for(int i=0;i<p.length;i++)
        {
            
            if(!maps.containsKey(p[i]) && !maps.containsValue(words[i]))
            {
                maps.put(p[i],words[i]);
            }
            else if(!maps.containsKey(p[i]))
            {
                return false;
            }
            else if(!maps.get(p[i]).equals(words[i]) )
            {
                return false;
            }
        }
        return true;
        
    }
}