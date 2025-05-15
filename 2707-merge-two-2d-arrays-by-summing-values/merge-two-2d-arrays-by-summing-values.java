class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            map.put(nums2[j][0],map.getOrDefault(nums2[j][0],0)+nums2[j][1]);
        }
        int[][] result=new int[map.size()][2];
        int index=0;
        for(int n:map.keySet())
        {
            result[index][0]=n;
            result[index][1]=map.get(n);
            index++;
        }
        Arrays.sort(result, (a, b) -> Integer.compare(a[0],b[0]));
        return result;
    }
}