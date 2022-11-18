class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m = mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++)
        {
            if(m<asteroids[i])
            {
                return false;
            }
            
            m+=asteroids[i];
        }
        return true;
    }
}