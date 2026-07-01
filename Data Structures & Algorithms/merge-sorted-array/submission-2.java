class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastIndex = m+n -1; // last combined index
        int i = m -1; // last index of nums1 - 4
        int j= n-1; // last index of nums2 - 3

        while(j >=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[lastIndex--]=nums1[i--];
            } else {
                nums1[lastIndex--] = nums2[j--];
            }
        }

        
    }
}