package ru.rabetskii.leetcode.longestPrefix_14;

import java.util.Objects;

//TODO
//код не рабочий, проходит 32/126 тестов

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        int answer = -1;
        String first = strs[0];
        if (Objects.equals(first, "")) {
            return first;
        }

        for (int i = 1; i < strs.length; ++i){
            if (Objects.equals(strs[i], "")){
                answer = -1;
                break;
            }
            for (int j = 0; j < strs[i].length(); j++) {
                if (first.charAt(j) != strs[i].charAt(j)) {
                    answer = j - 1;
                    break;
                }
                answer = j;
            }
            if (strs[i].length() <= answer) {
                answer = strs[i].length();
            }
        }

        if (answer == -1){
            return "";
        } else if (answer == 0){
            return first.substring(0, 1);
        }else {
            return first.substring(0, answer + 1);
        }
    }
}