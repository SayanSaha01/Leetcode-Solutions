class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(o1,o2)->
        {
            String s1=o1+o2;
            String s2=o2+o1;
            return s2.compareTo(s1);
        });
        if(str[0].equals("0"))
           return str[0];
        StringBuilder sb = new StringBuilder();
        for(String s:str)
        {
            sb.append(s);
        }
        return sb.toString();
    }
}