class Solution:
    def isPalindrome(self, s: str) -> bool:
        sstr = ''
        for i in s.lower():
            if i.isalnum():
                sstr+=i
        return True if sstr==sstr[::-1] else False