class Solution {
    public boolean isValid(String s)
    {
        int open=0;
        for(char c:s.toCharArray())
        {
            open+=c=='('?1:-1;
            if(open<0) return false;
        }
        return open==0;
    }
    public void dfs(String s,List<String> res,int n)
    {
        if(s.length()==n*2)
        {
            if(isValid(s)) res.add(s);
            return;
        }
        dfs(s+"(",res,n);
        dfs(s+")",res,n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs("",res,n);
        return res;
    }
}