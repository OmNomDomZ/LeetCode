package ru.rabetskii.leetcode.problem_796;

public class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        int n = 0;
        String newString;
        boolean result = false;
        while (n != len){
            s = s.substring(1, len) + s.charAt(0);
            n++;
            if (s.equals(goal)){
                result = true;
                break;
            }
        }
        return result;
    }
}
