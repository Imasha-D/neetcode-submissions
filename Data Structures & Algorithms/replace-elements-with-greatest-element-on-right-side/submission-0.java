class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int rightMax = -1;
        int[] ans = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            ans[i] = rightMax;
            rightMax = Math.max(rightMax ,arr[i]);
        }

        return ans ;
    }
}