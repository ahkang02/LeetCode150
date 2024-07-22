package ArraysAndHashing.GroupAnagram;

/*

Context
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> results = new ArrayList<>();
        boolean isGrouped[] = new boolean[strs.length];

        for(int i = 0; i < strs.length; i++) {
            if(!isGrouped[i]) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                isGrouped[i] = true;

                for(int j = i + 1; j < strs.length; j++) {
                    if(!isGrouped[j] && isAnagram(strs[i], strs[j])) {
                        group.add(strs[j]);
                        isGrouped[j] = true;
                    }
                }
                results.add(group);
            }
        }
        return results;
    }

    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
}
