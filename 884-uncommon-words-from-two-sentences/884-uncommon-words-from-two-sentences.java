class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String w1:s1.split(" "))
        {
            map.put(w1,map.getOrDefault(w1,0)+1);
        }
        for(String w2:s2.split(" "))
        {
            map.put(w2,map.getOrDefault(w2,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(String s:map.keySet())
        {
            if(map.get(s)==1)
                sb.append(s+" ");   
        }
        if(sb.toString().equals(""))
            return new String[0];
        return sb.toString().trim().split(" ");
    }
}