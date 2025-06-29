class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int n: nums)
        {
            if(n%2==0)
            {
                freq.put(n,freq.getOrDefault(n,0)+1);
            }
        }
        int maxf=0,element=-1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet())
        {
            if(entry.getValue()>maxf)
            {
                maxf=entry.getValue();
                element=entry.getKey();
            }
            if(entry.getValue()==maxf)
            {
                if(element>entry.getKey())
                {
                    element=entry.getKey();
                }
            }

        }
        
        return element;
        
    }
}