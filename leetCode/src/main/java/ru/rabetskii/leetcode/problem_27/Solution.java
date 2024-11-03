package ru.rabetskii.leetcode.problem_27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = nums.clone();
        for (int num : nums) {
            if (num != val) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int j = 0;
        for (int value : temp) {
            if (map.containsKey(value)) {
                for (int k = 0; k < map.get(value); ++k) {
                    nums[j] = value;
                    ++j;
                }
                map.remove(value);
            }
        }

        System.out.println(Arrays.toString(nums));
        return j;
    }
}
