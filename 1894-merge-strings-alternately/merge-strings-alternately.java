class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=Math.min(word1.length(),word2.length());
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(word1.length()>n){
            sb.append(word1.substring(i,word1.length()));
        }
        else if(word2.length()>n)
        {
            sb.append(word2.substring(i,word2.length()));
        }
        return sb.toString();
    }
}