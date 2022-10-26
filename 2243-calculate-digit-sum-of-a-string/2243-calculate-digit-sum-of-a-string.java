class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){   /*If the length of the string is greater than k, repeat from step 1.*/
            
            String newstr = "";   /*for storing updated string*/
            
            for(int i=0; i<s.length(); i+=k){ // retrieving small parts of string in k equal parts
			
                int sum=0; // for finding "sum"
				
                String temp = s.substring(i,Math.min(i+k, s.length()));  //for substring from ith to (i+k)th position
				
                for(int itr = 0; itr<temp.length(); itr++){
                    sum += temp.charAt(itr) - '0';
                }
                
                newstr = newstr + "" + sum; // storing sum into new string
            }
            
            s = newstr;  /*Updating original string with new string containing sum of digits*/
        }
        
        return s;
    }
}