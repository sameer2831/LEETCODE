class Solution {
    public int maximumLength(int[] nums) {
        int odds=0,evens=0;
        int n=nums.length;
        for(int i:nums)
        {
            if(i%2==0) evens++;
            else odds++;
        }
        //if(evens==n || odds==n) return n;
        int evenDp=0,oddDp=0;
        for(int num: nums)
        {
            if(num%2==0)
            {
                evenDp=Math.max(evenDp,oddDp+1);
            }
            else{
                oddDp=Math.max(oddDp,evenDp+1);
            }
        }
        //int len= Math.min(odds,evens)*2;
        //System.out.println("len = "+len+" Math.max(evenDp, oddDp))"+ Math.max(evenDp, oddDp));
        return Math.max(Math.max(evens, odds), Math.max(evenDp, oddDp));
        
    }
}