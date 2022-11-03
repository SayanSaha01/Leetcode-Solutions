class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                list.add(index++,arr[i]);
                list.add(index++,0);
            }
            else
            {
                list.add(index++,arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
    }
}