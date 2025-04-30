class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int num: nums){
            String digits=Integer.toString(num);
            if(digits.length()%2==0)
            {
                result++;
            }
        }
        return result;
        
    }
}