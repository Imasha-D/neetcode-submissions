class Solution {
    public void reverseString(char[] s) {
        int left = 0 ;
        int l = s.length -1;
        for(int right = l ; right > l/2;right--){
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
        }

    }
}