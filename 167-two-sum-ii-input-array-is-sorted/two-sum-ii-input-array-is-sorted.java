class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Map<Integer,Integer> maps=new HashMap<>();
        int n=numbers.length;
        int l=0,r=n-1;
        while(l<r)
        {
            int sum=numbers[l]+numbers[r];
            
            if(sum>target)
            {
                r--;
            }
            else if(sum<target)
            {
                l++;
            }
            else{
                return new int[]{l+1,r+1};
            }
            
        }
        // for(int i=0;i<n;i++)
        // {
        //     int diff=target-numbers[i];
        //     if(maps.containsKey(diff))
        //     {
        //         return new int[]{maps.get(diff),i+1};
        //     }
        //     maps.put(numbers[i],i+1);
        // }
        return new int[0];
    }
}