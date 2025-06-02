class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            StringBuffer sbf = new StringBuffer(arr[i]);
            // Reverse String
            sbf.reverse();
            res+=sbf.toString()+" ";
        }
        return res.trim();
        
    }
}