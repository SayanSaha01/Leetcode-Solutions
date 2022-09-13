class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<String,String>();
        for(int i=0;i<paths.size();i++)
        {
            String citya=paths.get(i).get(0);
            String cityb=paths.get(i).get(1);
            map.put(citya,cityb);
        }
        String destination = paths.get(0).get(0);
        while(map.containsKey(destination))
        {
            destination = map.get(destination);
        }
        return destination;
    }
}