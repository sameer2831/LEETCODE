class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> maps=new HashMap<>();
        for(int n:arr)
        {
            maps.put(n,maps.getOrDefault(n,0)+1);
        }
        for(int t:target)
        {
            if(maps.containsKey(t))
            {
                maps.put(t,maps.get(t)-1);
                if(maps.get(t)<=0)
                {
                    maps.remove(t);
                }
            }
            else{
                return false;
            }
        }
        return maps.size()==0;
        
    }
}