class Solution {
    public int countOdds(int low, int high) {
        //total numbers in the range low to high
        int total= high-low+1;
        
        /*Let's take the following cases
        Case-1
        When low is odd and high is odd */
        if (low % 2 != 0 && high % 2 != 0) {
            /* Let's assume for a small range - [ odd, even, odd, even, odd ]
            Here, we have extra odd so adding 1
            total number of odd numbers are total/2 + 1 
            */
            return total/2 + 1;
        }
        /*Case-2
         When low is odd and high is even - [ odd, even, odd, even ]
         no. of odd = no. of even = total/2
        
        Case-3
        When low is even and odd is high - [ even, odd, even, odd ]
        no. of odd = no. of even = total/2
        
        Case-4
        When low is even and high is even - [ even, odd, even, odd, even ]
        Here, we have an extra even number but
        no. of odd numbers = total/2
        */
        else
            return total/2;    
    }
}