class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double minAvg  = Double.MAX_VALUE;
        while(left<right){
            double Avg = (nums[left]+nums[right])/2.0;
            minAvg = Math.min(minAvg,Avg);
            left++;
            right--;
        }
        return minAvg;
    }
}