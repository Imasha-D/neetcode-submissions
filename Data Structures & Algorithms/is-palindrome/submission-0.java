class Solution {
    public boolean isPalindrome(String s) {
      
    s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] arrO = s.toCharArray();
    char[] arrR = new StringBuilder(s)
                .reverse().toString().toCharArray();

if(Arrays.equals(arrO,arrR))
return true;
else
   


   
        return false;
        
    }
}
