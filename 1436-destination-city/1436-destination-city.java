class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<String,String>();
        for(int i=0;i<paths.size();i++)
        {
            String citya=paths.get(i).get(0);
            String cityb=paths.get(i).get(1);
            map.put(citya,cityb);
        }
        String currentcity = paths.get(0).get(0);     //getting the first city then checking if the map contains destination then we get the des
        while(map.containsKey(currentcity))
        {
            currentcity = map.get(currentcity);
        }
        String destination=currentcity;
        return destination;
    }
}