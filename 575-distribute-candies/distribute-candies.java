class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candy=new HashSet<>();
        for(int n:candyType)
        {
            candy.add(n);
        }
        return Math.min(candy.size(),(candyType.length/2));

        
    }
}