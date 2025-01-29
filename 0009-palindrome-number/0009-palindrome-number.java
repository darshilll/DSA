class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while(x != 0){
            if( x < 0){
                return false;
            }
            int lastD = x % 10;
            rev = rev * 10 + lastD;
            x = x / 10;
        }
        return original == rev;
    }
}