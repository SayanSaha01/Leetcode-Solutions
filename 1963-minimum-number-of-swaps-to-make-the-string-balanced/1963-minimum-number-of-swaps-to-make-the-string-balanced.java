class Solution {
    public int minSwaps(String s) {
        int open = 0, unbalanced = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '[')
                open++;
            else {
                if(open > 0) {
                    open--; 
                } 
                else unbalanced++;
            }
        }
        unbalanced += open;
        unbalanced /= 2; 
        return (unbalanced+1)/2;
    }
}