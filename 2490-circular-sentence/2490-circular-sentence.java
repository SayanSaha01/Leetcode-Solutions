class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        String[] wrd = new String[words.length+1];
        for (int i = 0; i < wrd.length-1; i++) {     
            wrd[i] = words[i];     
        } 
        wrd[wrd.length-1]=words[0];
        for(int i=0;i<wrd.length-1;i++)
        {
            if(wrd[i].charAt(wrd[i].length()-1)!=wrd[i+1].charAt(0))
              return false;
        }
        return true;
    }
}