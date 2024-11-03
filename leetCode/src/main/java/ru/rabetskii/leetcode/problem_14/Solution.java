package ru.rabetskii.leetcode.problem_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        if (strs[0].isEmpty()) {
            return "";
        }
        String first = strs[0];

        int answer = 100;

        for (int i = 1; i < strs.length; ++i) {
            if (strs[i].isEmpty()) {
                return "";
            }
            int answer2 = 0;

            int len = Math.min(first.length(), strs[i].length());

            for (int j = 0; j < len; ++j) {
                if (first.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                answer2 += 1;
            }

            if (answer2 < answer){
                answer = answer2;
            }
        }

        if (answer == 0) {
            return "";
        } else {
            return first.substring(0, answer);
        }

    }
}