class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
            return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<sentence.length();i++)
        {
            Character ch = sentence.charAt(i);
            map.put(ch,i);
        }
        return map.size()==26?true:false;
    }
}