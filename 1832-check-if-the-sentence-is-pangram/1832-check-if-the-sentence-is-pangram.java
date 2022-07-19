class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)return false;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            char current = sentence.charAt(i);
            if(!set.contains(current)) set.add(current);
        }
        System.out.println(set.size());
        return set.size() == 26 ? true:false;
    }
}