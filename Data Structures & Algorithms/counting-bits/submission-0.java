class Solution {
    public int[] countBits(int n) {

   
    int[] returnArr = new int[n+1];
    for(int i =0 ; i <= n; i++){
        returnArr[i] = Integer.bitCount(i);
        
    }  
        
        return returnArr;
    }
}
