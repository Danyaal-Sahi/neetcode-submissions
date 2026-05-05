class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        new_set = set()

        for x in nums:
            if x in new_set:
                return True
            new_set.add(x)
        return False

        