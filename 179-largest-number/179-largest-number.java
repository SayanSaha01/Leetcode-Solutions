class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=String.valueOf(nums[i]);
        }
// https://www.youtube.com/watch?v=qEIGhVtZ-sg for understanding the custom comparator 
        Arrays.sort(str,(o1,o2)->
        {
            String s1=o1+o2;
            String s2=o2+o1;
            return s2.compareTo(s1);
        });
//this checks if the first string in the list of strings is 0 or not as we are sorting the array of strings in descending order if the max number stored correspondingly in the first index comes out to be 0 then the number will be  0 only  
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