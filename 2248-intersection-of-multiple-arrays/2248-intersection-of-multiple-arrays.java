class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count=new int[1001];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                count[nums[i][j]]++;
            }
        }
        List<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==nums.length)
                arr.add(i);
        }
        return arr;
    }
}