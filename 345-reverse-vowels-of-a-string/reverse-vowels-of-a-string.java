class Solution {
    public boolean isVowel(char c)
    {
        String v="aeiouAEIOU";
        if(v.contains(String.valueOf(c)))
        {
            return true;
        }
        else return false;
    }
    public String reverseVowels(String s) {
        char[] words=s.toCharArray();
        int l=0,r=words.length-1;
        while(l<r)
        {
            while(!isVowel(words[l]) && l<r)
            {
                l++;
            }
            while(!isVowel(words[r]) && r>l)
            {
                r--;
            }
            char temp=words[r];
            words[r]=words[l];
            words[l]=temp;
            l++;
            r--;
        }
        return new String(words);
    }
}