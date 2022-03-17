public class Solution {
    
    public int hammingWeight(int n) {
        
        int onesCount = 0;
    	
        while(n!=0) {
    		
            onesCount = onesCount + (n & 1);
    		n = n>>>1;
    	}
    	
        return onesCount;
    }
}

/*
Runtime: 1 ms, faster than 81.59% of Java online submissions for Number of 1 Bits.
Memory Usage: 41.9 MB, less than 6.61% of Java online submissions for Number of 1 Bits.
*/
