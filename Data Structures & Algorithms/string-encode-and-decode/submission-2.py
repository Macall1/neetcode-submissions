class Solution:

    def encode(self, strs: List[str]) -> str:
        new_str = ""
        for s in strs:
            new_str += s + "\n"
        return new_str


    def decode(self, s: str) -> List[str]:
        strs = []
        k = 0
        for i in range(len(s)):
            if s[i] == "\n":
                strs.append(s[k:i])
                k = i+1
        return strs


