package ru.rabetskii.leetcode.lengthOfTheLastWord_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = s.length();

        while (s.charAt(length - 1) == ' ') {
            length--;
        }

        // can use s.trim()
        // trim() remove whitespaces from both ends of a string

        int answer = 0;
        while (length > 0 && s.charAt(length - 1) != ' ') {
            answer++;
            length--;
        }

        return answer;
    }
}
