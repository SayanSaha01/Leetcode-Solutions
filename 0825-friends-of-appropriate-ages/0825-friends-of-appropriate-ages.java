class Solution {
    public int numFriendRequests(int[] ages) {
        int[] ageCounts = new int[121];
        int friendReqCount = 0;
        
        // Count how many people there are for each age
        for(int age : ages) {
            ageCounts[age]++;
        }
        
        for(int a=0; a<=120; a++) {
            // Iterate over the allowed range for B's age
            for(int b=(int)(0.5*a)+7+1; b<=a; b++) {
                friendReqCount += ageCounts[a] * ageCounts[b];
                
                if(a==b) {
                    // A will not friend request him/herself
                    friendReqCount -= ageCounts[a];
                }
            }
        }
        
        return friendReqCount;
    }
}