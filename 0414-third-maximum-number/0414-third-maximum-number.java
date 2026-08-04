
class Solution {
    public int thirdMax(int[] nums) {

        long firstmax = Long.MIN_VALUE;
        long secondmax = Long.MIN_VALUE;
        long thirdmax = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstmax ||
                nums[i] == secondmax ||
                nums[i] == thirdmax) {
                continue;
            }
            if (nums[i] > firstmax) {
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = nums[i];
            }

            else if (nums[i] > secondmax) {
                thirdmax = secondmax;
                secondmax = nums[i];
            }

            else if (nums[i] > thirdmax) {
                thirdmax = nums[i];
            }
        }

        if (thirdmax == Long.MIN_VALUE) {
            return (int) firstmax;
        }

        return (int) thirdmax;
    }
}