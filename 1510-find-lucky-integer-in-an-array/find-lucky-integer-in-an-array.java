class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n:arr)
        {
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int result=-1;
        for(Map.Entry<Integer,Integer> set:freq.entrySet())
        {
            if(set.getKey()==set.getValue())
            {
                result=result>set.getKey()?result: set.getKey();
            }
        }
        return result;
    }
}