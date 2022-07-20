class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int step=0;
        for(char c:s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char z=t.charAt(i);
            if(map.containsKey(z)&&map.get(z)>0)
                map.put(z,map.get(z)-1);
            else
                step++;
        }
        return step;
    }
}