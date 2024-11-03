package ru.rabetskii.leetcode.problem_8;

public class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int result = 0;
        boolean numIsStart = false;
        boolean isNegative = false;
        boolean isPositive = false;
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9' || (s.charAt(i) == '-' && !numIsStart) || (s.charAt(i) == '+' && !numIsStart)) {
                if (s.charAt(i) == '0' && !numIsStart) {
                    numIsStart = true;
                    continue;
                }
                if (s.charAt(i) == '-' && !isNegative && !numIsStart && !isPositive) {
                    numIsStart = true;
                    isNegative = true;
                    continue;
                }
                if (s.charAt(i) == '+' && !isNegative && !numIsStart && !isPositive) {
                    numIsStart = true;
                    isPositive = true;
                    continue;
                }
                if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    if (!isPositive && !isNegative) {
                        numIsStart = true;
                        isPositive = true;
                    }
                    if (isPositive) {
                        if (result > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
                            return Integer.MAX_VALUE;
                        }else {
                            result = result * 10 + (s.charAt(i) - '0');
                        }
                    }
                    if (isNegative) {
                        if (result < (Integer.MIN_VALUE + (s.charAt(i) - '0')) / 10) {
                            return Integer.MIN_VALUE;
                        }else {
                            result = result * 10 - (s.charAt(i) - '0');
                        }
                    }
                }
            }
            else {
                break;
            }
        }
        return result;
    }
}
