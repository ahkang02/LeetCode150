package ArraysAndHashing.DuplicateNumber;

/*

Context
Given an integer array nums,
return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true

Example 2:
Input: nums = [1, 2, 3, 4]
Output: false

*/

public class Solution {
    public static boolean hasDuplicate(int[] nums) {

        // Loop Through Nums With Two Loops

        boolean isDuplicate = false;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    isDuplicate = true;
                }
            }
        }

        return isDuplicate;
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{1,2,3,3};
        int[] nums = new int[]{1,2,3,4};
        System.out.println(hasDuplicate(nums));
    }
}
