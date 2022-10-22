class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        PriorityQueue<String> pq = new PriorityQueue<String>((a,b)->
        b.length()-a.length()==0?      //longest string
        a.compareTo(b):                //If there is more than one possible result, return the longest word with the smallest lexicographical order
        b.length()-a.length());   
        for(String str:dictionary)
        {
            int i=0,j=0;
            while(i<s.length() && j<str.length())
            {
                if(s.charAt(i)==str.charAt(j))
                {
                    i++;
                    j++;
                }
                else{
                    i++;
                }
                if(j==str.length())
                {
                    pq.offer(str);
                }
            }
        }
        if(pq.isEmpty())
        {
            return "";
        }
        return pq.poll();
    }
}