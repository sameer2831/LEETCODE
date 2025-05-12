import java.util.ArrayList;
class Solution {
        public static int[] convertIntSetToStringSet( 
                Set<Integer> setOfInteger) 
        { 
        return setOfInteger.stream() 
        .mapToInt(Integer::intValue) 
        .toArray(); 
        } 
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        //ArrayList<Integer> res=new ArrayList<Integer>();
        Set<Integer> result=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(i!=j && j!=k && i!=k)
                    {
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        if(num%2==0 && num>99)
                        {
                            result.add(num);
                        }
                    }
                }
            }
        }
        int[] arr=convertIntSetToStringSet(result);
        Arrays.sort(arr);
        //arr=res.toArray(arr);
        return arr;
        
    }
}