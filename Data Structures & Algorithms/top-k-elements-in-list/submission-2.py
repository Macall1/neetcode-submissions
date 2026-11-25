from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        """55
        given  nums with k return k most frequent elements

        """
        count = Counter(nums)
        return [num for num, freq in count.most_common(k)]


        