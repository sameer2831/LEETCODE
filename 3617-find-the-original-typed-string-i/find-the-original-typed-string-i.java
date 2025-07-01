class Solution {
    public int possibleStringCount(String word) {
        int freq[]=new int[26];
        int result=1;
        char arr[]=word.toCharArray();
        for(int i=1;i<arr.length;i++ )
        {
            if(arr[i]==arr[i-1]) freq[arr[i]-'a']++;
        }
        for(int n:freq)
        {
            result+=(n);
            
        }
        return result;
    }
}