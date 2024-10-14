class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        ans=[]
        for i,str in enumerate(words):
            if x in str:
                ans.append(i)
        return ans
            