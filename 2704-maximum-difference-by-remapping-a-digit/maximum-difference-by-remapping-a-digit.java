class Solution {
    public int minMaxDifference(int num) {
        String number = Integer.toString(num);
        char firstNon9 = 0;
        char firstNon0 = 0;

        for (char n : number.toCharArray()) {
            if (firstNon9 == 0 && n >= '0' && n <= '8') firstNon9 = n;
            if (firstNon0 == 0 && n >= '1' && n <= '9') firstNon0 = n;
        }

        String maxN;
        if(firstNon9 != 0) {
            maxN=number.replace(firstNon9, '9');
        }
        else{
            maxN=number;
        }
        String minN; 
        if(firstNon0 != 0){
            minN=number.replace(firstNon0, '0');
        }else{
            minN=number;
        } 

        return Integer.parseInt(maxN) - Integer.parseInt(minN);
    }
}