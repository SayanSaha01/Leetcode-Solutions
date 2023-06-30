class Solution {
    List<Integer> list=new ArrayList<>();
    public int[] separateDigits(int[] nums) {
        for(int i:nums)
        {
            func(i);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void func(int num)
    {
        String val = String.valueOf(num);
        char[] arr = val.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]-'0');
        }
    }
}