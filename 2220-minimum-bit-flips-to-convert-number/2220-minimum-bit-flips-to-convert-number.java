class Solution {
    public int minBitFlips(int start, int goal) {
        //we find the xor of start and goal, it will result in a number with 1 in places where corresponding bits of start and goal are different and 0 in places where the corresponding places of start and goal are similar
        int xor=start^goal;
        int count=0;
        //then in the xored
        return Integer.bitCount(xor);
    }
}