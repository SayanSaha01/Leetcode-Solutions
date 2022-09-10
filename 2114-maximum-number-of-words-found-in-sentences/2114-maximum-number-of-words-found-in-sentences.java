class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            int count=0;
            for(char ch: sentences[i].toCharArray())
            {
                if(ch==' ')
                {
                    count++;
                }
            max = Math.max(count+1,max);
            }
        }
        return max;
    }
}