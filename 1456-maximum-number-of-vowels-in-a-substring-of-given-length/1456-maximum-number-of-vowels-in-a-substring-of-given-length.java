class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            if ("aeiou".indexOf(s.charAt(right)) != -1) {
                count++;
            }
             if (right - left + 1 == k) {
                max = Math.max(max, count);

                if ("aeiou".indexOf(s.charAt(left)) != -1) {
                    count--;
                }

                left++;
            }
        }

        return max;
    }
}