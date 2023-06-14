import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger b = new BigInteger(s, 2);
        int steps = 0;
        while(!b.equals(BigInteger.ONE)) {
            if(b.testBit(0)) {
                b = b.add(BigInteger.ONE);
            } else {
                b = b.shiftRight(1);
            }
            steps++;
        }
        return steps;
    }
}