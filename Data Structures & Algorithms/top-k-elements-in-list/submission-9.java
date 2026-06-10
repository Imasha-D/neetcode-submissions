class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        Queue<int[]> priorityQ = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            priorityQ.offer(new int[] {entry.getValue(), entry.getKey()});
            if (priorityQ.size() > k)
                priorityQ.poll();
        }

        int[] res = new int[k];
        for(int i = 0 ; i < k ; i ++ ){
            res[i] = priorityQ.poll()[1];
        }
        return res;
    }
}
