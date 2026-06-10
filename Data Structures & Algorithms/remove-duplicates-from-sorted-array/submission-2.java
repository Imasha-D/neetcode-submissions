class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        System.out.println(hs);

        int i = 0;
        for (int num : hs) {
            nums[i++] = num;
        }

        return hs.size();
    }
}