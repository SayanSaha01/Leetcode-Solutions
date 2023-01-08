class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> rankmap = new HashMap<Integer,Integer>();
        HashMap<Character,Integer> suitmap = new HashMap<Character,Integer>();
        for(int i:ranks)
        {
            rankmap.put(i,rankmap.getOrDefault(i,0)+1);
        }
        for(char c:suits)
        {
            suitmap.put(c,suitmap.getOrDefault(c,0)+1);
        }
        if(suitmap.containsValue(5))
            return "Flush";
        if(rankmap.containsValue(3) || rankmap.containsValue(4) || rankmap.containsValue(5))
            return "Three of a Kind";
        if(rankmap.containsValue(2))
            return "Pair";
        return "High Card";
    }
}