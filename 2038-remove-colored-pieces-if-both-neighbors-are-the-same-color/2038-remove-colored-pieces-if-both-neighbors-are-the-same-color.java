class Solution {
    public boolean winnerOfGame(String colors) {
        int countA=0;
        int countB=0;
        
        char[] arr = colors.toCharArray();
        for(int i=1;i<colors.length()-1;i++)
        {
            if(arr[i-1]=='A' && arr[i]=='A' && arr[i+1]=='A')
            {
                countA++;
            }
            else if(arr[i-1]=='B' && arr[i]=='B' && arr[i+1]=='B')
            {
                countB++;
            }
        }
        return countA > countB;
    }
}