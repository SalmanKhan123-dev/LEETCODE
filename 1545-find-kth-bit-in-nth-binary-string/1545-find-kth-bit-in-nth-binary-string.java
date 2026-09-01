class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }

        int length = (1 << n) - 1;
        int middle = length / 2 + 1;

        if (k == middle) {
            return '1';
        }

        if (k < middle) {
            return findKthBit(n - 1, k);
        }

        int mirror = length - k + 1;
        char bit = findKthBit(n - 1, mirror);

        return bit == '0' ? '1' : '0';
    }
}