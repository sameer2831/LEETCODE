class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int n=arr.length;
        if(n==2)
        {
            res.add(Arrays.asList(arr[0],arr[1]));
            return res;
        }
        int minDiff=arr[n-1];
        for(int i=1;i<n;i++)
        {
            int diff=Math.abs(arr[i]-arr[i-1]);
            if(diff<minDiff)
            {
                minDiff=diff;
                res.clear();
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(diff==minDiff)
            {
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
       
        return res;
    }
}