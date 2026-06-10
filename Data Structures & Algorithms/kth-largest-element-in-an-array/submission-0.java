class Solution {
    public int findKthLargest(int[] nums, int k) {        

        Arrays.sort(nums);

        int largest = nums[nums.length-k];

        return largest ;
        
    }
}
