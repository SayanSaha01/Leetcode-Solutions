class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char ch = coordinates.charAt(0);
        int digit = coordinates.charAt(1)-'0';
        
        if(ch=='a' || ch=='c'|| ch=='e'|| ch=='g')
        {
            if(digit%2==0)
                return true;
            else
                return false;
        }
        else 
        {
            if(digit%2==1)
                return true;
            else
                return false;
        }
    }
}