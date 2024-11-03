package ru.rabetskii.leetcode.problem_26;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
