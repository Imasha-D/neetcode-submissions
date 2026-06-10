class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer> map = new HashMap<>();
        int l = 0; 
        int res= 0;
        for(int i = 0 ; i <s.length(); i ++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                l=Math.max(map.get(ch) + 1, l);
            }
            map.put(ch, i);
            res = Math.max(res, i-l+1);
        }
        return res;
    }
}
