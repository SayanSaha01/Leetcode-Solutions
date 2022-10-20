/*let me explain the proof in a very simple way:
we sorted the people by their weight......then there are two cases:

CASE-I : "minimum weight" man can't sit with "maximum weight" man
it implies that "maximum weight" man can't sit with any other man
hence "maximum weight" man sits alone so decrement only high end pointer.

CASE-II : "minimum weight" man can sit with "maximum weight" man
it implies that "minimum weight" man can sit with any other man
since we want to maximize the amount of weight carried by a single boat we sit "minimum weight" man and "maximum weight" man together.
so increment low end pointer and decrement high end pointer
*/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        int count=0;
        while(start <= end)
        {
            if(people[start]+people[end]<=limit)
            {
                count++;
                start++;
                end--;
            }
            else
            {
                count++;
                end--;
            }
        }
        return count;
    }
}