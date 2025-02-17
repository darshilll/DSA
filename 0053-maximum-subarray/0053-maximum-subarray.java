import static java.lang.Integer.max;

class Solution {
    public int maxSubArray(int[] nums) {
        // B R U T E F O R C E
        // int maxi = Integer.MIN_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        // int sum = 0;
        // for (int j = i; j < nums.length; j++) {
        // sum += nums[j];
        // maxi = max(sum,maxi);
        // }
        // }
        // return maxi;

        int maxi = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxi = Math.max(currentSum, maxi);

            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxi;
    }
}