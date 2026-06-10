class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int len = chars.length;
        int iterator = 0;

        while (iterator < len) {
            // add the first occurence firsgt in to the string builder
            sb.append(chars[iterator]);
            int r = iterator + 1; // check next character
            while (r < len && chars[r] == chars[iterator]) {
                r++;
            }
            if ( r - iterator > 1)
                sb.append(String.valueOf(r - iterator));

            System.out.println(r);
            iterator = r;
        }

        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }
        return sb.length();
    }
}