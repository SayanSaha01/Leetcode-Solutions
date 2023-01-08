class Solution {
    public int maxPoints(int[][] points) {
        int max_num = 0; // initialization and declaration of maximum number (variable)
        for(int[] x:points){ // for x
            Map<Double, Integer>map = new HashMap<>(); // HashMap for double and integer data type
            for(int[] y: points){  // for y
                if(x==y){ // if x is equal to y then condition is true 
                    continue;
                }
                double slope = 0; // initialize new variable and declare to double data type
                if(y[0]-x[0]==0){ // apply condition if condition is true then slope = Double.POSITIVE_INFINITY 
                    slope = Double.POSITIVE_INFINITY;
                }
                else{ // otherwise slope = (y[1]-x[1])/(double)(y[0]-x[0])
                    slope = (y[1]-x[1])/(double)(y[0]-x[0]);
                    
                }
// put in map slope,map.getOrDefault(slope,0)+1
                map.put(slope,map.getOrDefault(slope,0)+1);
                max_num = Math.max(max_num, map.get(slope));
// check and assign max value in max_num
            }
        }
        return max_num + 1;  // return max_num + 1 ( answer )
    }
}