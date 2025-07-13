class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        if(players.length==0 || trainers.length ==0) return 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0,r=0;
        int match=0;
        int n=players.length;
        int m=trainers.length;
        while(l<n && r<m)
        {
            if(players[l]<=trainers[r])
            {
                match++;
                l++;
                r++;
                System.out.println(" l= "+l+" r= "+r+" match = "+match);
            }
            else{
                r++;
                System.out.println(" Inside else");
                System.out.println(" l= "+l+" r= "+r+" match = "+match);
            }
        }
        return match;
    }
}