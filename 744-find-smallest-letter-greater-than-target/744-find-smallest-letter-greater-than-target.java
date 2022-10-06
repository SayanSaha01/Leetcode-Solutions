/*
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c:letters)
        {
            if(c-'a'>target-'a')
                return c;
        }
        return letters[0];
    }
}
/*the question says this -

Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.

so if we cant find a greater char in array we return first element
*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int ans = 0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(letters[mid]==target)
            {
                start = mid+1;
            }
            else if(letters[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                ans = mid;
                end = mid-1;
            }
        }
        return letters[ans];
    }
}