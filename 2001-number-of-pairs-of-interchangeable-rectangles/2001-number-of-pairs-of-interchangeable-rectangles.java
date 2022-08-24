class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        long sum=0;
        HashMap<Double,Integer> map = new HashMap<Double,Integer>();
        for(int i=0;i<rectangles.length;i++)
        {
            double ratio = (double)rectangles[i][0]/rectangles[i][1];
            
            if(map.containsKey(ratio))
                sum += (long)map.get(ratio);
            
            map.put(ratio,map.getOrDefault(ratio,0)+1);
        }
        return sum;
    }
}