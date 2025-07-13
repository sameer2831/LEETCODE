class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length() || t.isEmpty()) return "";
        Map<Character,Integer> freq=new HashMap<>();
        Map<Character,Integer> window=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        for(int i=0;i<n2;i++)
        {
            freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i),0)+1);
        }
        int formed=0,needed=freq.size();
        int minLen=Integer.MAX_VALUE,start=0,end=0;
        int l=0,r=0;
        while(r<s.length())
        {
            char c=s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(freq.containsKey(c) && freq.get(c).intValue()==window.get(c).intValue()) formed++;

            while(l<=r && formed==needed)
            {
                if(r-l+1<minLen)
                {
                    minLen=r-l+1;
                    start=l;
                    end=r;
                    //System.out.println(s.substring(start,end+1));
                }
                window.put(s.charAt(l),window.get(s.charAt(l))-1);
                if(freq.containsKey(s.charAt(l)) && freq.get(s.charAt(l)).intValue()>window.get(s.charAt(l)).intValue())
                {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}