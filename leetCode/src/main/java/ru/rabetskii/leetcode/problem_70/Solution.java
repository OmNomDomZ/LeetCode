package ru.rabetskii.leetcode.problem_70;

public class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        return climb(n, cache);
    }

    private int climb(int n, int[] cache){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            return 0;
        }

        if (cache[n] != 0){
            return cache[n];
        }

        cache[n] = climb(n - 1, cache) + climb(n - 2, cache);
        return cache[n];
    }
}