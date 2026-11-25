class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """
        11
        return largest sum of cont non-empty seq of elements
        """
        curr_sum = nums[0]
        max_sum = nums[0]
        for i in range(1, len(nums)):
            curr_sum = max(curr_sum+nums[i], nums[i])
            max_sum = max(curr_sum, max_sum)
        return max_sum




        