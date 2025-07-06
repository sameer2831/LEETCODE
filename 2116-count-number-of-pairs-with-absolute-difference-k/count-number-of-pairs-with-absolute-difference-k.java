class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        int result=0;
        for(int n:nums)
        {
            freq.put(n,freq.getOrDefault(n,0)+1);
            int a=n+k,b=n-k;
            if(freq.containsKey(a))
            {
                result+=freq.get(a);
            }
            if(freq.containsKey(b))
            {
                result+=freq.get(b);
            }
        }
        return result;
    }
}