class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
    for (char c:s1.toCharArray()){
        map1.put(c, map1.getOrDefault(c, 0)+1);
    }
    int i = 0, j = s1.length()-1;
    while (j<s2.length()){
        Map<Character, Integer> curr = new HashMap<>();
        for (int a=i;a<=j;a++){
            curr.put(s2.charAt(a), curr.getOrDefault(s2.charAt(a), 0)+1);
        }
        if (curr.equals(map1)){
            return true;
        }
        i++;
        j++;
    }
    return false;
    }
}