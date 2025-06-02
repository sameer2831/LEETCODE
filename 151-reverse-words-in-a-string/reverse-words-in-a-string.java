class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split(" ");
        String res="";
        for(int i=arr.length-1;i>0;i--)
        {
            System.out.println(arr[i]);
            if(arr[i].trim().isEmpty())
            {
                continue;
            }
            else{
                res+=arr[i]+" ";
            }
            
        }
        return res+arr[0];
    }
}