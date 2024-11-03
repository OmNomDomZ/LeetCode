package ru.rabetskii.leetcode.problem_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

//        for (int i = 0 ; i < nums.length; i++) {
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target && i != j){
//                    return new int[] {i, j};
//                }
//            }
//        }
//
//        return new int[] {};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[] {};
    }
}