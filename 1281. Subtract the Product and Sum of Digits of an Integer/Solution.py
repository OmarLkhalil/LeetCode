class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        productOfDigits = 1
        sumOfDigits = 0
        
        for digit in str(n):
            productOfDigits *= int(digit)
            sumOfDigits += int(digit)
            
        return productOfDigits - sumOfDigits
