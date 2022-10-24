class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] s = sentence.split(" ");
        for (String s1 : s){
            for (String s2: dict)
                if (s1.startsWith(s2)) { s1 = s2; }
            sb.append(s1).append(" ");
            }
        return sb.toString().trim();
    }
}