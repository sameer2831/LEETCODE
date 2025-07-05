class Solution {
    public static int findLucky(int[] numbers) { 
        int[] freq = new int[501]; 

        for (int num : numbers) freq[num]++; 

        for (int i = 500; i > 0; i--){
            while(freq[i]==0 && i>1)
            {
                i--;
            }
            if (i == freq[i]) return i;  
        } 

        return -1;
    }
}