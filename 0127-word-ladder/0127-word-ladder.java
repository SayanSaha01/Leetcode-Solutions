class Pair{
    String first;
    int second;
    Pair(String first,int second)
    {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        HashSet<String> set = new HashSet<>(); 
        for(int i=0;i<wordList.size();i++)
        {
            set.add(wordList.get(i));
        }
        set.remove(beginWord);
        while(!q.isEmpty())
        {
            String word = q.peek().first;
            int step = q.peek().second;
            q.remove();
            
            if(word.equals(endWord)==true)
                return step;
            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    // check if it exists in the set and push it in the queue.
                    if (set.contains(replacedWord) == true) {
                        set.remove(replacedWord);
                        q.add(new Pair(replacedWord, step + 1));
                    }
                }

            }
        }
        return 0;
    }
}