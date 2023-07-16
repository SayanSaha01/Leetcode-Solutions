class Solution {
    public int minimumIndex(List<Integer> list) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxfreqval=0;
        int maxfreq=0;
        map.put(0,0);
        int cnt=0;
        int n = list.size();
        for(int i=0;i<list.size();i++)
        {
            int val = list.get(i);
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)>=map.get(maxfreqval))
            {
                maxfreqval=val;
                maxfreq=map.get(val);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            int val = list.get(i);
            if(map.get(val)==maxfreq)
                cnt++;
            if((2*cnt>i+1) && (map.get(val)-cnt)*2>(n-i-1))
                return i;
        }
        return -1;
    }
}