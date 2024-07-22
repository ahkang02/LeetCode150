package ArraysAndHashing.LongestConsecutiveSequence;

/*

Context:
Given an array of integers nums,
return the length of the longest consecutive sequence of elements.

A consecutive sequence is a
sequence of elements in which each element is exactly 1 greater than the previous element.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [2,20,4,10,3,4,5]
Output: 4

Example 2:
Input: nums = [0,3,2,5,4,6,1,1]
Output: 7
*/

import java.util.Arrays;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Skip duplicates
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        longestStreak = Math.max(longestStreak, currentStreak);
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,20,4,10,3,4,5};
        System.out.println(longestConsecutive(nums));
    }
}

/*

Explanation:
Edge Case Handling:
Check if the input array is null or empty, and return 0 in such cases.

Sorting the Array:
Sort the array. This ensures that any consecutive sequence will be adjacent in the sorted array.

Initialize Streak Counters:
Initialize two variables:
longestStreak to keep track of the longest consecutive sequence
currentStreak to count the current sequence length.

Iterate Through the Array:
Start from the second element and iterate through the array:

Skip Duplicates:
 If the current element is the same as the previous element,
 continue to the next iteration.

Check for Consecutive Elements:
 If the current element is exactly one more than the previous element,
 increment the currentStreak.

Reset the Streak:
 If the current element is not consecutive with the previous element,
 update the longestStreak with the maximum of longestStreak and currentStreak, and reset currentStreak to 1.

Final Update:
After the loop, ensure to update longestStreak one last time to account
for a streak that might end at the last element of the array.

Return the Result:
Return longestStreak.

*/
