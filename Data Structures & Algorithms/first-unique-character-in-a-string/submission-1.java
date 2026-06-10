class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> charMap = new HashMap<>();
        int len = s.length();

        for(int i = 0 ; i < len ; i++){
            char ch= s.charAt(i);
if (!charMap.containsKey(ch)) {
                charMap.put(ch, i);
            } else {
                charMap.put(ch, len);
            }        }

        System.out.println(charMap);
        int res = len;
        for(int index : charMap.values()){
            res=Math.min(res,index);
        }

        return  res== len? -1 : res ;
    }
}