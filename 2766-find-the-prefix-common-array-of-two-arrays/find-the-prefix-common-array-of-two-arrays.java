class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int freq[]=new int[n+1];
        int result[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            freq[A[i]]++;
            freq[B[i]]++;
            if(A[i]==B[i])
            {
                count++;
            }
            if(freq[A[i]]==2 && A[i]!=B[i])
            {
                count++;
            }
            if(freq[B[i]]==2 && A[i]!=B[i])
            {
                count++;
            }
            result[i]=count;
        }

        return result;
    }
}