class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> hp = new HashMap<>();
        for(int num : nums){
            hp.put(num, hp.getOrDefault(num, 0)+1);
        }

        for(int n : hp.values()){
            if(n %2==1)
            return false;
        }
        return true;
    }
}