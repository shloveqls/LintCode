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
        return new ArrayList<>();
    }

}
