class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int reve = 0;

        while(num != 0){
            int ld = num % 10;

            if(reve > (Integer.MAX_VALUE - ld) / 10){
                return 0;
            }

            reve = reve * 10 + ld;
            num = num / 10;
        }
        return (x < 0) ? (-reve) : reve;
    }
}