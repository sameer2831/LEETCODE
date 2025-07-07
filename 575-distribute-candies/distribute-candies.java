class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> candy=new HashSet<>();
        int maxC=candyType.length/2;
        for(int n:candyType)
        {
            candy.add(n);
        }
        return Math.min(candy.size(),maxC);

        
    }
}