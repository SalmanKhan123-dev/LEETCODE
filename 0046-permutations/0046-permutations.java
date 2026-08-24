import java.util.*;

class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, 0, result);

        return result;
    }

    public void backtrack(int[] nums, int index,
                          List<List<Integer>> result) {

        // Base case
        if (index == nums.length) {

            List<Integer> current = new ArrayList<>();

            for (int num : nums) {
                current.add(num);
            }

            result.add(current);

            return;
        }

        for (int i = index; i < nums.length; i++) {

            // Choose
            swap(nums, index, i);

            // Explore
            backtrack(nums, index + 1, result);

            // Undo
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}