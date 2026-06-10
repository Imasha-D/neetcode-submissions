class Solution {
    public int[] productExceptSelf(int[] nums) {

        int num = nums.length;
        int[] res = new int[num];

        for(int i = 0; i < num ; i++){
            int prod = 1;
            for(int j = 0 ; j < num ; j++){
                if(i!=j)
                prod *= nums[j]; 
            }
            res[i] = prod;
        }
        
        return res;
        
    }
}  
