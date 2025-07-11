class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        int sum=0;
        if(n<3)
        {
            for(int a:cost)
            {
                sum+=a;
            }
            return sum;
        }
        Arrays.sort(cost);
        
        for(int i=n-1;i>=0;i-=3)
        {
            System.out.println(i);
            if(i-1>-1) sum+=(cost[i]+cost[i-1]);
            else sum+=cost[i];
        }
        return sum;
    }
}