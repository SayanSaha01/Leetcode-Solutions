class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] c = s.toCharArray();
        int count=0;
        while(s.contains("01"))
        {
            for(int i=0;i<c.length-1;i++)
            {
                if(c[i]=='0' && c[i+1]=='1')
                {
                    char temp = c[i];
                    c[i]=s.charAt(i+1);
                    c[i+1]=temp;
                    i++;
                }
            }
            s = new String(c);
            c = s.toCharArray();
            count++;
        }
        return count;
    }
}