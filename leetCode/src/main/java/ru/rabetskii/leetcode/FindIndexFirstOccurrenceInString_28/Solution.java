package ru.rabetskii.leetcode.FindIndexFirstOccurrenceInString_28;

public class Solution {
    public int findFirstOccurrenceInString(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 1;
                for (int index = i + 1; j < needle.length() && index < haystack.length(); j++, index++) {
                    if (haystack.charAt(index) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
