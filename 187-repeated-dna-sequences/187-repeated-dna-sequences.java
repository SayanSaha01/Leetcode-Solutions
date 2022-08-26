class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++)
        {
            String subsequence = s.substring(i,i+10);
            map.put(subsequence,map.getOrDefault(subsequence,0)+1);
        }
        for(String i:map.keySet())
        {
            if(map.get(i)>1)
            {
                list.add(i);
            }
        }
        return list;
    }
}