
#remove min and max number.
#Calculate average.


class Solution:
    def average(self, salary):
        salary.remove(max(salary))
        salary.remove(min(salary))
        return (sum(salary)/len(salary))
