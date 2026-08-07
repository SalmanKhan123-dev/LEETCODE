class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int lp = 0;
        int max = 0;

        for (int rp = 0; rp < s.length(); rp++) {

            while (set.contains(s.charAt(rp))) {
                set.remove(s.charAt(lp));
                lp++;
            }

            set.add(s.charAt(rp));

            max = Math.max(max, rp - lp + 1);
        }

        return max;
    }
}