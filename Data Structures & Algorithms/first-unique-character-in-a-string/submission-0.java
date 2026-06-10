class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] chArr= s.toCharArray();
        for(int i = 0 ; i < s.length(); i ++){
            // charMap.put(chArr[i], charMap.getOrDefault(chArr[i], 0) + 1);
            charMap.computeIfPresent(chArr[i], (k, v) -> v+=1);
            charMap.computeIfAbsent(chArr[i], k -> 1);
        }
            
       
            for(int i = 0 ; i < s.length() ; i ++){
                if(charMap.get(s.charAt(i)) == 1)
                    return i;
            }
       
        return -1 ;
    }
}