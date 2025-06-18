class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length,n=mat[0].length;
        Map<Integer,int[]> positionMap=new HashMap<>();
        int rowsCount[]=new int[m];
        int colsCount[]=new int[n];
        Arrays.fill(rowsCount,n);
        Arrays.fill(colsCount,m);
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                positionMap.put(mat[row][col],new int[]{row,col});
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int pos[]=positionMap.get(arr[i]);
            rowsCount[pos[0]]--;
            colsCount[pos[1]]--;
            if(rowsCount[pos[0]]==0 || colsCount[pos[1]]==0)
            {
                return i;
            }
        }
        return -1;
    }
}