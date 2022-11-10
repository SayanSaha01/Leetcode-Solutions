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