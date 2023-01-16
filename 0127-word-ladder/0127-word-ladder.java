class Pair{
    String first;
    int count;
    Pair(String first,int count)
    {
        this.first = first;
        this.count = count;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<wordList.size();i++)
        {
            set.add(wordList.get(i));
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!queue.isEmpty())
        {
            String word = queue.peek().first;
            int step = queue.peek().count;
            queue.poll();
            
            if(word.equals(endWord)==true)
                return step;
            
            for(int i=0;i<word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char[] arr = word.toCharArray();
                    arr[i]=ch;
                    String newstr = new String(arr);
                    
                    if(set.contains(newstr))
                    {
                        set.remove(newstr);
                        queue.add(new Pair(newstr,step+1));
                    }    
                }
            }
        }
        return 0;
    }
}