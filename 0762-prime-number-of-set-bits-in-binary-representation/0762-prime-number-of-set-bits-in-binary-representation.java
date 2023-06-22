class Solution {

    boolean checkPrime(int bit){
        if(bit <= 1) return false;
        for(int i=2; i<bit; i++){
            if((bit%i)== 0){
                return false;
            }
        }

        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            if(checkPrime(Integer.bitCount(i))){
                count++;
            }
        }

        return count;
    }
}