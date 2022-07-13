class Solution {
    public int maximum69Number (int num) {
        char[] numstr = String.valueOf(num).toCharArray();
        for(int i=0;i<numstr.length;i++)
        {
            if(numstr[i]=='6')
            {
                numstr[i]='9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(numstr));
    }
}