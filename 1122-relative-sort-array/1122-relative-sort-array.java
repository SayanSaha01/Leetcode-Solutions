class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:arr1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int x=0; x<map.get(arr2[i]); x++)
            {
                arr3[index++]=arr2[i];
            }
            map.remove(arr2[i]);
        }
        
        //now adding the remaining elements in arr1 if left any
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Map.Entry <Integer,Integer> entry: map.entrySet())
        {
            for(int i=0;i<entry.getValue();i++)
            {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            arr3[index++] = list.get(i);
        }
        return arr3;
    }
}