/*just maintain three pointers to hold most recent indices of a,b and c . then the number of substrings at any index lets say with char c is the most closest index to left from where a and b are found +1 for the new substring .
       len = 11
       index-> 0 1 2 3 4 5 6 7 8 9 10
           s-> c b c b c c b  b a a a
      
     c   -> 0
     cb  -> 0
     cbc -> 0
     cbcb ->0
     cbcbc->0
     cbcbcc->0
     cbcbccb->0
     cbcbccbb->0
     cbcbccbba->1      // as it is mentioned substring containing at least one                           occurence of all three characters
     bcbccbba->2
     cbccbba->3
     bccbba->4
     ccbba->5
     cbba ->6   in this case the most recent index of b and c are 6 and 5 so min(6,5)+1
    
    */
    
class Solution {
    public int numberOfSubstrings(String s) {
        int substrings=0;
        
        int a_index=-1;
        int b_index=-1;
        int c_index=-1;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                a_index=i;
                if(b_index!=-1 && c_index!=-1)
                    substrings+=Math.min(b_index,c_index)+1;
            }
            
            else if(s.charAt(i)=='b')
            {
                b_index=i;
                if(a_index!=-1 && c_index!=-1)
                    substrings+=Math.min(a_index,c_index)+1;
            }
            
            else
            {
                c_index=i;
                if(a_index!=-1 && b_index!=-1)
                    substrings+=Math.min(a_index,b_index)+1;
            }
        }
        return substrings;
    }
}