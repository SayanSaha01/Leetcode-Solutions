class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        lst = []
        for w in sentences:
            lst.append(len(list(w.split(" "))))
        return max(lst)