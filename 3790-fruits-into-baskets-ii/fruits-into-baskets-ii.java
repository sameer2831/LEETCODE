class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        //Arrays.sort(fruits);
        //Arrays.sort(baskets);
        int n=fruits.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    count++;
                    baskets[j]=-1;
                    break;
                }
            }

        }
        return n-count;
    }
}