class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> values = new HashSet<>();
        while (n != 1){
            if (values.contains(n)){
                return false;
            }
            values.add(n);
            n = summation(n);
        }
        return true; 
    }
    public int summation(int number){
        int sum = 0;
        while(number > 0){
            sum += (number%10) * (number%10);
            number = number/10;
        }
    return sum;
}
}
    
