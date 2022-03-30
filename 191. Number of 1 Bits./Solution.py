class Solution:
    def hammingWeight(self, n: int) -> int:
        onesCount = 0
        while n:
            
            onesCount += n%2
            n = n >> 1
        return onesCount
