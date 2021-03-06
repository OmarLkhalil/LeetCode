// JAVA 

class Solution {
      public double average(int[] salary) {
        final int ArrayLength = salary.length;
        int minimumSalary = salary[0], maximumSalary = salary[0];
        double summation = salary[0];
        for (int i = 1; i < ArrayLength; i++) {
            if (minimumSalary > salary[i]) minimumSalary=salary[i];
            if (maximumSalary < salary[i]) maximumSalary=salary[i];
            summation += salary[i];
        }
        summation = summation - maximumSalary - minimumSalary;
        return summation / (ArrayLength - 2);
    }
}






/*

Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Odd Numbers in an Interval Range.
Memory Usage: 41 MB, less than 38.62% of Java online submissions for Count Odd Numbers in an Interval Range.


*/
