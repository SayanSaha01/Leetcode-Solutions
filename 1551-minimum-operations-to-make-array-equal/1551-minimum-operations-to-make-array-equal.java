class Solution {
    public int minOperations(int n) {
        int cunt=n/2;
        return n%2==0?cunt*cunt:cunt*(cunt+1);
    }
}