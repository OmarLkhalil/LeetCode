class Solution:
    def isHappy(self, n, values=[]):
        nums = sum([int(x)**2 for x in list(str(n))])
        if nums in values:
            return False
        return self.isHappy(nums, values+[nums]) if nums != 1 else True
