class Solution {
    public int minMaxDifference(int num) {
        String number=Integer.toString(num);
        char ch='\0';
        for(char n:number.toCharArray())
        {
            if(n!='9')
            {
                ch=n;
                break;
            }
        }
        String maxN;
        if(ch!='\0')
        {
            StringBuilder sb=new StringBuilder();
            for(char n:number.toCharArray())
            {
                sb.append(n==ch ? '9' : n);
            }
            maxN=sb.toString();
        }
        else{
            maxN=number;
        }
        char at0=number.charAt(0);
        StringBuilder ms=new StringBuilder();
        for(char n:number.toCharArray())
        {
            ms.append(n==at0 ? '0' : n);
        }
        String minN=ms.toString();

        return Integer.parseInt(maxN)-Integer.parseInt(minN);
    }
}