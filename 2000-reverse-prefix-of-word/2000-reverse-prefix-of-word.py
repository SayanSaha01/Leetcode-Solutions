class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        i=word.find(ch)
        if i==-1:
            return word
        else:
            q = word[:i+1]
            p = word[i+1:]
            q = q[::-1]
            return q+p
        