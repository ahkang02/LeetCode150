package IsPalindrome;

/*

Context:
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward.
It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true

Explanation:
After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:
Input: s = "tab a cat"
Output: false

Explanation: "tabacat" is not a palindrome.
*/

public class Solution {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverse = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reverse);
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}

// Approach Using Two Pointer
/*
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
*/

/*

Explanation:
Initialize Two Pointers:
Start with two pointers, left at the beginning of the string and right at the end of the string.

Compare Characters:
In a loop, compare the characters at the left and right pointers.

Move Pointers:
If the characters are equal, move the left pointer to the right and the right pointer to the left.

Check Mismatch:
If any characters do not match, return false.

Return Result:
If the loop completes without finding mismatched characters, return true.

*/
