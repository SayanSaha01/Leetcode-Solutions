class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0; 
        for(char ch:s.toCharArray())
        {
            if(ch==letter)
                count++;
        }
        return (count*100)/s.length(); 
    }
}