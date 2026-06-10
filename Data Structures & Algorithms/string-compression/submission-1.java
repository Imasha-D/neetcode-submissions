class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int len = chars.length;
        int i =0 ;

        while(i<len){
            sb.append(chars[i]); // add first char  to the string builder
            int j = i + 1; // check next chars
            while (j < len && chars[i] == chars[j]) {
                j++; 
            }

            if (j - i > 1) {
                sb.append(String.valueOf(j - i));
            }

            i = j;

        }

        System.out.println(sb);

for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }
        
        return sb.length();
        
    }
}