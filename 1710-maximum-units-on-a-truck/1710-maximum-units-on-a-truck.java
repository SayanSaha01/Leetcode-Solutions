class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int total=0;
        for(int[] boxes:boxTypes)
        {
            if(truckSize<boxes[0])
            {
                return total+truckSize*boxes[1];
            }
            total+=boxes[0]*boxes[1];
            truckSize-=boxes[0];
        }
        return total;
    }
}