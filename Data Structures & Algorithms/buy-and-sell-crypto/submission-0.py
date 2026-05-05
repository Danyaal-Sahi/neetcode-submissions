class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        min = prices[0]
        total = 0
        for x in prices:
            if x < min:
                min = x
            total = max(total,(x-min))
        return total




        