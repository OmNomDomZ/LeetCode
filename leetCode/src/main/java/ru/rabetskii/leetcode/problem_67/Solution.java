package ru.rabetskii.leetcode.problem_67;

public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int aVal = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bVal = (j >= 0) ? b.charAt(j) - '0' : 0;
            if (((aVal == 1 && bVal == 0) || (bVal == 1 && aVal == 0))) {
                if (carry == 1) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }
            } else if (aVal == 1 && bVal == 1) {
                if (carry == 1) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                carry = 1;
            } else {
                if (carry == 0) {
                    sb.append(0);
                } else {
                    sb.append(1);
                    carry = 0;
                }
            }
            i--;
            j--;
        }
        if (carry == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }
}