class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        common = []
        for i in nums1:
            if i in nums2:
                common.append(i)
        return list(set(common))