class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] track = new int[n];

        // Base cases
        track[0] = nums[0];
        track[1] = Math.max(nums[0], nums[1]);

        // DP logic
        for (int i = 2; i < n; i++) {
            int take = nums[i] + track[i - 2];
            int skip = track[i - 1];

            track[i] = Math.max(take, skip);
        }

        return track[n - 1];
    }
}