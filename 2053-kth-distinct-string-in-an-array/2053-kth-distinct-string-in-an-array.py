class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        map={}
        for i in arr:
            if i in map.keys():
                map[i]+=1
            else:
                map[i]=1
        unique=[]
        for i in map.keys():
            if map[i]==1:
                unique.append(i)
        if k>len(unique):
           return ""
        else:
           return unique[k-1]