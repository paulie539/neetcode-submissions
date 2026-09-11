class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return true;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] - 1);
        }
        for (int i = 0; i < dp.length - 1; i++) {
            if (dp[i] == 0) return false;
        }
        return true;
    }
}
