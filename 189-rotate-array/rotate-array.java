class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];

        // Place each element at its rotated position
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];  
            // for each element of i -> i+k it is moving , to wrap up %n 
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        
    }
}