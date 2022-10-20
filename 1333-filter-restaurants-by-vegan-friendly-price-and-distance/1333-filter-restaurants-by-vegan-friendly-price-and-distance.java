/*For simplicity veganFriendlyi and veganFriendly take value 1 when it is true, and 0 when it is false.
The veganFriendly filter will be either true (meaning you should only include restaurants with veganFriendlyi set to true) or false (meaning you can include any restaurant).
*/
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> result = new ArrayList<Integer>();
        //sort them by ID's, if same then sort by ratings
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b)->b[1]==a[1]? b[0]-a[0]: b[1]-a[1]);    //For restaurants with the same rating, order them by id from highest to lowest.
/*
restaurants=[[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]], veganFriendly = 0, maxPrice = 30, maxDistance = 3   
here if we take the other way round restaurants[i][2]<=veganFriendly we would be iterating over the int[] arrays where  veganFriendly = 0 ,but that is not what we want it is mentioned if 0 we can include any restaurant so we take veganFriendly<=restaurants[i][2], hence we iterate over all the int[] arrays and then accordingly chceck whcih of the int[] has values less than maxPrice and maxDistance*/

        for(int i=0;i<restaurants.length;i++)
        {
            if(veganFriendly==1)
            {
                if(veganFriendly!=restaurants[i][2])
                {
                    continue;
                }
            }
            if(restaurants[i][3]<=maxPrice && restaurants[i][4]<=maxDistance)
//why veganFriendly < = restaurants[i][2] and not the other way round, lets take for example, 
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