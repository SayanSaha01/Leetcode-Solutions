class Solution {
    public String largestPalindromic(String num) {
    // Storing the occurances of each digit in string
    int occ[] = new int[10];
    
    for(int i = 0; i < num.length(); i++){
        occ[num.charAt(i) - '0']++;
    }
    
    StringBuilder first = new StringBuilder();
    
    for(int i = 9; i >= 0; i--){
        
        // if occurance of digit is greater than one  
        if(occ[i] > 1){
            
            // Avoiding the leading zeros
            if(i == 0 && first.length() == 0)
                continue;
            
            //Appending the even occurances of digits 
            for(int j = 0; j < occ[i] / 2; j++)
                first.append(i);
            
            occ[i] = occ[i]%2;               
            
        }
    }
    
    //Storing one digit at middle of resultant string
    String mid = "";
    
    for(int i = 9; i >= 0; i--)
    {
        if(occ[i] > 0){
            mid += i;
            break;
        }
    }
    
    StringBuilder res = new StringBuilder();
    res.append(first);
    res.append(mid);
    res.append(first.reverse());
    
    return res.toString(); 
   }
}