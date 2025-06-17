class Solution {
    public boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
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