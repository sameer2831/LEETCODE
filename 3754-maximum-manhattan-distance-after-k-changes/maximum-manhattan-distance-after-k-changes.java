class Solution {
    public int maxDistance(String s, int k) {
        int ans = 0;
        int north = 0, south = 0, east = 0, west = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='N') north++;
            else if(c=='S') south++;
            else if(c=='E') east++;
            else west++;
            int x=east-west;
            int y=north-south;
            int MD=Math.abs(x)+Math.abs(y);
            int increase=Math.min(k*2,(i+1)-MD);
            ans=Math.max(ans,MD+increase);
        }
        return ans;
    }
}