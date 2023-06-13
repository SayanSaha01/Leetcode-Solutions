class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        int minindex = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                if(minindex==map.get(list2[i])+i)
                {
                    list.add(list2[i]);
                }
                else if(minindex>map.get(list2[i])+i)
                {
                    minindex=map.get(list2[i])+i;
                    list.removeAll(list);
                    list.add(list2[i]);
                }
            }
        }
        String[] str = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            str[i]=list.get(i);
        }
        return str;
    }
}