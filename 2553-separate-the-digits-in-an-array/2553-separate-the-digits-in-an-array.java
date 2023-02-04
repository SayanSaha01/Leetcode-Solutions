class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] separateDigits(int[] nums) {
        for(int i:nums)
        {
            add(i);
        }
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }
    public void add(int num)
    {
        String val = String.valueOf(num);
        for(int i=0;i<val.length();i++)
        {
            list.add(val.charAt(i)-'0');
        }
    }
}