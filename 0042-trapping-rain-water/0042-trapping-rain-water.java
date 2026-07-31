class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int TrappedWater = 0;
        int leftBoundary[] = new int[height.length];
        int rightBoundary[] = new int[height.length];
        leftBoundary[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftBoundary[i] = Math.max(height[i], leftBoundary[i-1]);
        }
        rightBoundary[n-1] = height[n-1];
        for(int i=n-2; i>=0 ; i--){
            rightBoundary[i] = Math.max(height[i], rightBoundary[i+1]);
        }
        for(int i=0 ; i<n ; i++){
            int MinBoundary = Math.min(leftBoundary[i], rightBoundary[i]);
            TrappedWater += (MinBoundary-height[i]);
        }
        return TrappedWater;
    }
}