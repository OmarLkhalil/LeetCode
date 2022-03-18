class Solution {
    public int subtractProductAndSum(int n) {
        
         int digitProduct = 1, digitSum = 0, temp = -1;

        while (n != 0) {
            temp = n % 10;
            digitProduct *= temp;
            digitSum += temp;
            n /= 10;

        }

        return digitProduct - digitSum;
}}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 39.3 MB, less than 70.16% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
*/
