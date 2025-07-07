class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int TagetTickets=tickets[k];
        int n=tickets.length;
        for(int i=0;i<n;i++)
        {
            if(i<=k)
            {
                time+=Math.min(tickets[i],TagetTickets);
            }
            else{
                time+=Math.min(tickets[i],TagetTickets-1);
            }
        }
        return time;
        
    }
}