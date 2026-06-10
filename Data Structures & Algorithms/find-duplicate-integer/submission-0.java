class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            if(hm.containsKey(num))return num;
            hm.putIfAbsent(num,1);
        }

        return 0;
        
    }
}
