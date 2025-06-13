class Solution {
    public boolean isPowerOfThree(int n) {
        // 3^19 =1162261467, 
        //  3^20 is exceding  Integer_Range So 3^19 is the highest power in Integer Range  
        return ( n>0 &&  1162261467%n==0);
    }
}