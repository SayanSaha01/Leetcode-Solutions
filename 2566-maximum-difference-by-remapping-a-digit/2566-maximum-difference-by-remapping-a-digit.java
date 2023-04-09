class Solution {
    public int minMaxDifference(int num) {
        char x[]=String.valueOf(num).toCharArray();
        char y[]=String.valueOf(num).toCharArray();

        //We record the highest digit of num to p and q here, 
        //and will explain why we need them later.
        char p=x[0],q=x[0];
       
       // In this loop, we are finding the most significant non-'9' digit, 
       //and record it into p.
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!='9')
            {
                p=x[i];
                break;
            }
        }

      //In this loop, we remap the the most significant non-'9' digit to be '9', 
      //so that we get the greatest number. 
        for(int i=0;i<x.length;i++)
        {
            if(x[i]==p)
            {
                x[i]='9';
            }
        }
     //After getting the greatest one, in this loop we try to get the smallest one
     //We remap the most significant digit to '0'.
        for(int i=0;i<x.length;i++)
        {
            if(y[i]==q)
            {
                y[i]='0';
            }
        }
     // 
        return Integer.parseInt(String.valueOf(x)) - Integer.parseInt(String.valueOf(y));
    }
}