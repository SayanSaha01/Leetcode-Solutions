class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count=0
        for words in details:
            w1 = int(words[11:13])
            if w1 > 60:
                count+=1
        return count