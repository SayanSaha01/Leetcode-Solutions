class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] brr = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            brr[i]=arr[i];   
        }
        Arrays.sort(brr);
        int count=1;
        for(int i=0;i<brr.length;i++)
        {
            if(!map.containsKey(brr[i]))
            {
                map.put(brr[i],count++);
            }
        }
        for(int i=0;i<brr.length;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}