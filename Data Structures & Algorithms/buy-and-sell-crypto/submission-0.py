class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        53
        """
        min_p = float('inf')
        best_profit = 0
        for price in prices:
            min_p = min(price, min_p)
            profit = price - min_p
            best_profit = max(profit, best_profit)
        return best_profit


        