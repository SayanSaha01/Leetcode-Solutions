class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        for(int i=0;i<heights.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[heights.length];
        int index=0;
        for(int j=heights.length-1;j>=0;j--)
        {
            res[index]=map.get(heights[j]);
            index++;
        }
        return res;
    }
}