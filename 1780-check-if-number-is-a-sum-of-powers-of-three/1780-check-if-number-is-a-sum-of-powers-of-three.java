class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==0)
            return true;
        if(n%3==0)
            return checkPowersOfThree(n/3);
        if(n%3==1)
            return checkPowersOfThree((n-1)/3);
        return false;    //when the remainder is 2, we cant think of 3^0 + 3^0 as in the question it is asked that we have to represent n as the sum of distinct powers of three while 3^0 , 3^0 arent distinct as they appear twice
    }
}