package Anagram;

/*
Context:
Given two strings s and t,
return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string,
but the order of the characters can be different.

Example 1:
Input: s = "racecar", t = "carrace"
Output: true

Example 2:
Input: s = "jar", t = "jam"
Output: false

*/

import java.util.Arrays;

public class Solution {

    public static boolean isAnagram(String s, String t)  {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {

        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t));
    }
}
