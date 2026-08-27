class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        int[] result = new int[n];

        int sum1 = 0;
        for(int i=0 ; i<n ; i++){
            ls[i] = sum1;
            sum1 = sum1 + nums[i];
        }
        int sum2 = 0;
        for(int i=n-1 ; i>=0 ; i--){
            rs[i] = sum2;
            sum2 = sum2 + nums[i];
        }
        for(int i=0 ; i<n ; i++){
            result[i] = Math.abs(ls[i]-rs[i]);
        }
        return result;
    }
}