class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal=0;
        int vertical=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                vertical++;
            }
            else if(moves.charAt(i)=='D')
            {
                vertical--;
            }
            else if(moves.charAt(i)=='L')
            {
                horizontal++;
            }
            else if(moves.charAt(i)=='R')
            {
                horizontal--;
            }
        }
        return horizontal==0 && vertical==0?true:false;
    }
}