class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(int i=0;i<words.length;i++)
        {
            StringBuilder str = new StringBuilder();
            for(int j=0;j<words[i].length();j++)
            {
                str.append(arr[words[i].charAt(j)-'a']);
            }
            set.add(str.toString());
        }
        return set.size();
    }
}