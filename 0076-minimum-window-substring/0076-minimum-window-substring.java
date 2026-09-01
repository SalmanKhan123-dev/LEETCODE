import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int required = t.length();
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (need.containsKey(c)) {
                if (need.get(c) > 0) {
                    required--;
                }
                need.put(c, need.get(c) - 1);
            }

            while (required == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (need.containsKey(leftChar)) {
                    need.put(leftChar, need.get(leftChar) + 1);

                    if (need.get(leftChar) > 0) {
                        required++;
                    }
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}