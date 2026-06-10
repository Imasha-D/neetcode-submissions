class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;
        for(int num : nums){
            if(!hashMap.containsKey(num)){
                hashMap.put(num, hashMap.getOrDefault(num -1, 0)+ hashMap.getOrDefault(num+1, 0) + 1);
                hashMap.put(num-hashMap.getOrDefault(num-1, 0), hashMap.get(num));
                hashMap.put(num+hashMap.getOrDefault(num+1, 0), hashMap.get(num));
                res = Math.max(res, hashMap.get(num));
            }
        }

        return res;
        
    }
}
