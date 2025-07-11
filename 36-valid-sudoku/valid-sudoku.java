class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int x=0;x<9;x+=3)
        {
            for(int y=0;y<9;y+=3)
            {
                if(!validSquare(board,x,y)) return false;
                System.out.print(validSquare(board,x,y)+" ");
            }
        }
        
        System.out.println("");
        for(int i=0;i<9;i++)
        {
            if(!validRow(board,i)) return false;
            System.out.print(validRow(board,i)+" ");
        }
        System.out.println("");
        for(int i=0;i<9;i++)
        {
            if(!validColumn(board,i)) return false;
            System.out.print(validColumn(board,i)+" ");
        }
        
        return true;
    }
    public boolean validRow(char[][] board,int row)
    {
        Map<Character,Integer> maps=new HashMap<>();
        
        for(int i=0;i<9;i++)
        {
               if(board[row][i]=='.') continue;

                if(maps.containsKey(board[row][i])) return false;
                maps.put(board[row][i],1);
        }
        return true;
    }
    public boolean validColumn(char[][] board,int c)
    {
        Map<Character,Integer> cmaps=new HashMap<>();
        
        for(int i=0;i<9;i++)
        {
               if(board[i][c]=='.') continue;

                if(cmaps.containsKey(board[i][c])) return false;
                cmaps.put(board[i][c],1);
        }
        return true;
    }
    public boolean validSquare(char[][] board,int x,int y)
    {
        Map<Character,Integer> smaps=new HashMap<>();
       
        for(int i=x;i<x+3;i++)
        {
            for(int j=y;j<y+3;j++)
            {
                if(board[i][j]=='.') continue;

                if(smaps.containsKey(board[i][j])) return false;
                smaps.put(board[i][j],1);
            }
        }
        return true;
    }
}