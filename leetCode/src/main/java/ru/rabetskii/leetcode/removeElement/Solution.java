package ru.rabetskii.leetcode.removeElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int removeElement(int[] nums, int val) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] temp = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i])) {
                for (int k = 0; k < map.get(temp[i]); ++k){
                    nums[j] = temp[i];
                    ++j;
                }
                map.remove(temp[i]);
            }
        }

        System.out.println(Arrays.toString(nums));
        return j;
    }
}
