class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> kinds = new HashSet<>();
        for(int i:candyType)
        {
            kinds.add(i);
        }
        return kinds.size()>=candyType.length/2?candyType.length/2:kinds.size();
    }
}