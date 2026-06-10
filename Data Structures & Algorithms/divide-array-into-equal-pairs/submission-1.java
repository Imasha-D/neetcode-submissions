class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> oddSet = new HashSet<>();

        for (int num : nums) {
            if (!oddSet.contains(num)) {
                oddSet.add(num);
            } else {
                oddSet.remove(num);
            }
        }

        return oddSet.isEmpty();
    }
}