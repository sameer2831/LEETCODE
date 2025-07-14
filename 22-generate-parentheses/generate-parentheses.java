class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backtracking(answer, new StringBuilder(), 0, 0, n);

        return answer;
    }

    private void backtracking(List<String> result,StringBuilder currString,int open,int close,int n)
    {
        if(currString.length()==2*n)
        {
            result.add(currString.toString());
            return;
        }
        if(open<n)
        {
            currString.append("(");
            backtracking(result,currString,open+1,close,n);
            currString.deleteCharAt(currString.length()-1);
        }
        if(close<open)
        {
            currString.append(")");
            backtracking(result,currString,open,close+1,n);
            currString.deleteCharAt(currString.length()-1);
        }
    }
       
}