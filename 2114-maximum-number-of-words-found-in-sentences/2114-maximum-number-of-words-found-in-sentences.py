class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        lst=[]
        for w in sentences:
            mx = len(list(w.split(" ")))
            lst.append(mx)
        return max(lst)