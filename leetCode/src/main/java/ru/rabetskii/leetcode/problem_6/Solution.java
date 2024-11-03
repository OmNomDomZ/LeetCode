package ru.rabetskii.leetcode.problem_6;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        String sCopy = s;

        int offset = (numRows - 1) + (numRows - 1);
        int j = 0;
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        for (int i = 0; i < numRows; i++) {
            for (; j < s.length(); j += offset) {
                stringBuilders[i].append(s.charAt(j));
                sCopy = sCopy.substring(0, j)  + " " + sCopy.substring(j + 1);
            }
            j = i + 1;
        }

        int n = numRows - 2;
        for (int i = n; i > 0; i--) {
            int k = 1;
            for (j = 0; j < sCopy.length(); j++) {
                if (sCopy.charAt(j) == ' ') {
                    continue;
                } else {
                    stringBuilders[i].insert(k, sCopy.charAt(j));
                    sCopy = sCopy.substring(0, j)  + " " + sCopy.substring(j + 1);
                    j += n - 1;
                    k += 2;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(stringBuilders[i].toString());
        }

        return result.toString();
    }
}
