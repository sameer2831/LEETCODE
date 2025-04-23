class Solution {
    public int countLargestGroup(int n) {
        Map<Integer,Integer> maps=new HashMap<>();
        int max=0;
        for(int i=1;i<=n;i++)
        {
            int sum=0,x=i;
            while(x>0)
            {
                sum+=x%10;
                x/=10;
            }
            maps.put(sum,maps.getOrDefault(sum,0)+1);
            max=Math.max(max,maps.get(sum));
        }
        int counter=0;
        for(int val:maps.values()){
            if(val == max)
            {
                counter++;
            }
        }
        return counter;
    }
}