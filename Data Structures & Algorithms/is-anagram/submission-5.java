class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Hashtable<Character, Integer > sht = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer > tht = new Hashtable<Character, Integer>();


        Arrays.sort(sArr); 
        Arrays.sort(tArr); 

        for(char c : sArr){
            if(!sht.containsKey(c))
                sht.put(c,1);
            else
                sht.put( c,sht.get(c) + 1);
        }

        for(char c : tArr){
            if(!tht.containsKey(c))
                tht.put(c,1);
            else
                tht.put( c,tht.get(c) + 1);
        }

        if(sht.equals(tht))
            return true; 
        else 
            return false;

    }
}
