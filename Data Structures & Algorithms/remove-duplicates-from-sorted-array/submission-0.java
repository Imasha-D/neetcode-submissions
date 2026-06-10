class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hashSetNumbers = new HashSet<>();
        int idx = 0;  

        for (int i = 0; i < nums.length; i++) {
            if (!hashSetNumbers.contains(nums[i])) { 
                hashSetNumbers.add(nums[i]);  
                nums[idx++] = nums[i];  
            }
        }
        return idx;

    }
}