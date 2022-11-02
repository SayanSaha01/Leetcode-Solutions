class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        HashSet<Character> set = new HashSet<Character>();
        for(char c:brokenLetters.toCharArray())
        {
            set.add(c);
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(char st:arr[i].toCharArray())
            {
                if(set.contains(st))
                {
                    count++;
                    break;
                }
            }
        }
        return arr.length-count;
    }
}