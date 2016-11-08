package com.freedom.lintCode.ladder.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {

        boolean result = false;

        if (s.length() == t.length()) {
            char[] charS = s.toCharArray();
            char[] charT = t.toCharArray();
            Arrays.sort(charS);
            Arrays.sort(charT);
            if (String.valueOf(charS).equals(String.valueOf(charT))) {
                result = true;
            }
        }

        return result;

    }

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {

        boolean result = false;

        int count = 0;
        for (char c : B.toCharArray()) {
            String strC = String.valueOf(c);
            if (A.contains(strC)) {
                A = A.replaceFirst(strC, "");
                count++;
            }
        }
        if (count == B.length()) {
            result = true;
        }

        return result;

    }

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     *
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {

        int result = -1;

        if (source != null && target != null) {
            result = source.indexOf(target);
        }

        return result;

    }

    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {

        List<String> result = new ArrayList<>();

        String[] sortedStrs = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] charStr = strs[i].toCharArray();
            Arrays.sort(charStr);
            sortedStrs[i] = String.valueOf(charStr);
        }

        for (int i = 0; i < sortedStrs.length; i++) {
            int count = 0;
            for (int j = i + 1; j < sortedStrs.length; j++) {
                if (sortedStrs[i] != null && sortedStrs[j] != null && sortedStrs[i].equals(sortedStrs[j])) {
                    if (count == 0) {
                        result.add(strs[i]);
                    }
                    result.add(strs[j]);
                    sortedStrs[j] = null;
                    count++;
                }
            }
            sortedStrs[i] = null;
        }

        return result;

    }

    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {

        int length = 0;

        char[] charB = B.toCharArray();

        for (int i = 0; i < B.length(); i++) {
            String str = String.valueOf(charB[i]);
            if (length == 0 && (A.indexOf(str) != -1) && str.length() > length) {
                length = str.length();
            }
            for (int j = i + 1; j < B.length(); j++) {
                str = str + String.valueOf(charB[j]);
                if ((A.indexOf(str) != -1) && str.length() > length) {
                    length = str.length();
                }
            }
        }

        return length;

    }

}
