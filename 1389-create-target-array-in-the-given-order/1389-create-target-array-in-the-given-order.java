class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int z=0;
        for(int i=0;i<index.length;i++)
        {
            list.add(index[i],nums[z++]);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}