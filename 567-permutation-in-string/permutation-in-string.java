class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        int freq[]=new int[26];
        int wfreq[]=new int[26];
        for(int i=0;i<n1;i++)
        {
            freq[s1.charAt(i)-'a']++;
            wfreq[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,wfreq)) return true;
        for(int j=n1;j<n2;j++)
        {
            wfreq[s2.charAt(j-n1)-'a']--;
            wfreq[s2.charAt(j)-'a']++;
            if(Arrays.equals(freq,wfreq)) return true;
        }
        return false;
    }
}