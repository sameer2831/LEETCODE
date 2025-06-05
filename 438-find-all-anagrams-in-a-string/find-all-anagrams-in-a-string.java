class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<Integer>();
        int n=s.length();
        int m=p.length();
        char arr[]=p.toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        for(int i=0;i<=n-m;i++)
        {
            String temp=s.substring(i,i+m);
            char t[]=temp.toCharArray();
            Arrays.sort(t);
            String u=new String(t);
            if(u.equals(str))
            {
                result.add(i);
            }
        }
        return result;
        
    }
}