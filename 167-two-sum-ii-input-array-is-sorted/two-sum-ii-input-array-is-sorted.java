class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> maps=new HashMap<>();
        int n=numbers.length;
        for(int i=0;i<n;i++)
        {
            int diff=target-numbers[i];
            if(maps.containsKey(diff))
            {
                return new int[]{maps.get(diff),i+1};
            }
            maps.put(numbers[i],i+1);
        }
        return new int[0];
    }
}