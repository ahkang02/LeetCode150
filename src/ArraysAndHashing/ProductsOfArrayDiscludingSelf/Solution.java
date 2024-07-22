package ArraysAndHashing.ProductsOfArrayDiscludingSelf;

public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = 0; j < nums.length; j ++) {
               if(i != j) {
                   product *= nums[j];
               }
            }
            result[i] = product;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,4,6};
        System.out.println(productExceptSelf(nums));
    }
}

/*

Explanation:
Initialize Result Array:
Create an array result of the same length as nums to store the products.

Outer Loop:
Iterate over each element in the input array nums using index i.

Inner Loop:
For each element nums[i], calculate the product of all elements except nums[i]
by iterating through the array with index j.

    Skip the current index i (if (i != j)).

    Multiply the current product by nums[j] for each j.

Store Product:
Assign the calculated product to result[i].

Return Result:
After the loops complete, return the result array.
*/
