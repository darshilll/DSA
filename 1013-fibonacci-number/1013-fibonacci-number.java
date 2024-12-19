class Solution {
    public int fib(int n) {
        if(n <= 1) return n;

        int lastD = fib(n -1);
        int secLastD = fib( n -2);
        return lastD + secLastD;
    }
}