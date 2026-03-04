class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowsum=0;
        for(int i=0;i<k;i++){
             windowsum+=nums[i];
        }
        int maxi=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum=windowsum-nums[i-k]+nums[i];
            maxi=Math.max(maxi,windowsum);            
        }
        return (double)maxi/k;
    }
}