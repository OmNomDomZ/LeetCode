package ru.rabetskii.leetcode.problem_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        boolean stopped = false;
        for (int j = digits.length - 1; j >= 0; j--) {
            int res = digits[j] + 1;
            digits[j] = res % 10;
            if (res <= 9) {
                stopped = true;
                break;
            }
        }

        if (!stopped) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(result, 1, digits, 1, digits.length - 1);
            result[0] = 1;
            return result;
        }else {
            return digits;
        }
    }
}
