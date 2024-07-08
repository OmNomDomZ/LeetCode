package ru.rabetskii.leetcode;

import ru.rabetskii.leetcode.longestPrefix_14.Solution;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"aaa","aa","aaa"};

        Solution solution = new Solution();
        String string = solution.longestCommonPrefix(strs);
        System.out.println(string);
    }
}
