class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b)->a[0]==b[0]
            //if the attacks are same sort then according to defense
                    ?a[1]-b[1]
                    :b[0]-a[0]);
        int max = properties[0][1];   //storing the defense
        int count=0;
        for(int i=1;i<properties.length;i++)
        {
            if(properties[i][1]<max)
            {
                count++;
            }
            else
                max = Math.max(max,properties[i][1]);
        }
        return count;
    }
}