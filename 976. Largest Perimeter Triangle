
class Solution {
    public int largestPerimeter(int[] array) {
        Arrays.sort(array);
        int LengthOfArray = array.length; 
        for (int i = LengthOfArray - 1; i >= 2; i--)
        {
            if (array[i-2] + array[i-1] > array[i])
            {return array[i-2] + array[i-1] + array[i];}
        }
        return 0;
    }}
