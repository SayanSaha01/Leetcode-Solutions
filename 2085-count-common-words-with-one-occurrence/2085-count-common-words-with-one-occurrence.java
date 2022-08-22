class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<String,Integer>();
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        for(String w1:words1)
        {
            map1.put(w1,map1.getOrDefault(w1,0)+1);
        }
        for(String w2:words2)
        {
            map2.put(w2,map2.getOrDefault(w2,0)+1);
        }
        int count=0;
        for(String num:words1){
            //here we are specifically checking for map2.getOrDefault(num,0)==1 because all the words in words1 may not be therte in words2 so it sets them to 0 if not prsent and checks its count if present
            if(map1.get(num)==1 && map2.getOrDefault(num,0)==1)
                count++;
        }
        return count;
    }
}