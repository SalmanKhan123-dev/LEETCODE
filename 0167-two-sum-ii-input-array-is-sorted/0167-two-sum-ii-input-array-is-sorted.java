class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int lp = 0;
        int rp = numbers.length - 1;

        while (lp < rp) {
         int sum = numbers[lp] + numbers[rp];

            if (sum < target) {
                lp++;
            } 
            else if (sum > target) {
                rp--;
            } 
            else {
                return new int[]{lp + 1, rp + 1};
            }
        }

        return new int[]{};
    }
}