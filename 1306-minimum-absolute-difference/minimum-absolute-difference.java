class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int n=arr.length;
        if(n==2)
        {
            List<Integer> lis=new ArrayList<>();
            lis.add(arr[0]);
            lis.add(arr[1]);
            res.add(lis);
            return res;
        }
        int minDiff=arr[n-1];
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(arr[i]-arr[i-1]);
            minDiff=Math.min(minDiff,diff);
        }
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(arr[i]-arr[i-1]);
            if(diff==minDiff)
            {
                List<Integer> temp=new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                res.add(temp);
            }
        }
        return res;
    }
}