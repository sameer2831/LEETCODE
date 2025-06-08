class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num<10)
        {
            return num;
        }
        else{
            while(num>0){
                int temp=num%10;
                sum+=temp;
                num=num/10;
            }
        }
        return addDigits(sum);
        
    }
}