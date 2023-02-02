class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int min_side = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] arr:rectangles)
        {
            min_side = Math.min(arr[0],arr[1]);
            max = Math.max(max,min_side);
            map.put(min_side,map.getOrDefault(max,0)+1);
        }
        return map.get(max);
    }
}