class Solution {
    public int climbStairs(int n) {
        int previouseOne = 1;
        int previouseTwo = 0;
        for(int i = 0 ; i < n; i ++){
            int current = previouseOne + previouseTwo;
            previouseTwo = previouseOne;
            previouseOne = current;
        }

        return previouseOne;
        
    }
}
