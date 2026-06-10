class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int r = total % k;
            if (!hm.containsKey(r))
                hm.put(r, i);
            else if( i - hm.get(r) >1)
            return true;

        }
        return false;
    }
}