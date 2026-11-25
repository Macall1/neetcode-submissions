from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """36
        """
        if Counter(s) == Counter(t):
            return True
        return False