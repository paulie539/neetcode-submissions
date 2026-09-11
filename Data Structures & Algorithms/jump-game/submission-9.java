class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        if (n == 0 || n == 1) return true;
        if (nums[0] == 0) return false;
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        for (int i = 1; i < n - 1; i++) {
            System.out.println(dp[i]);
            dp[i] = Math.max(nums[i], dp[i - 1] - 1);
            if (dp[i] == 0) return false;
        }
        return true;
    }
}
