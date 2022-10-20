class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> result = new ArrayList<Integer>();
        //sort them by ID's, if same then sort by ratings
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b)->b[1]==a[1]? b[0]-a[0]: b[1]-a[1]);    //For restaurants with the same rating, order them by id from highest to lowest.
        
        for(int i=0;i<restaurants.length;i++)
        {
            if(veganFriendly<=restaurants[i][2] && restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance)
            {
                pq.offer(restaurants[i]);
            }
        }
        while(!pq.isEmpty())
        {
            result.add(pq.poll()[0]);
        }
        return result;
    }
}