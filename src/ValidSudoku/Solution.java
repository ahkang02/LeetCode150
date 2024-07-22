package ValidSudoku;

import java.util.HashSet;
import java.util.Set;

/*

Context:
Valid Sudoku
You are given a 9 x 9 Sudoku board.
 A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false

Note: A board does not need to be full or be solvable to be valid.

Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","8",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: true

Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: false

*/

public class Solution {
    public static boolean isValidSudoku(char[][] board) {
        // Use a set to keep track of seen numbers in rows, columns, and subgrids
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.') {
                    String rowKey = number + " in row " + i;
                    String colKey = number + " in column " + j;
                    String subGridKey = number + " in subgrid " + (i / 3) + "-" + (j / 3);

                    if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(subGridKey)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

/*

Explanation:
Set to Track Seen Numbers:
A HashSet is used to track the numbers that have been seen in each row, column, and subgrid.

Iterate Over the Board:
Iterate through each cell of the board.
For each cell, if it contains a digit (i.e., not '.'), construct three keys:
One for the row (e.g., 5 in row 0).
One for the column (e.g., 5 in column 0).
One for the subgrid (e.g., 5 in subgrid 0-0).
Check for Duplicates: Try to add each key to the seen set.
If adding any of the keys returns false, it means a duplicate has been found, and the board is not valid.
Return the Result: If no duplicates are found, return true, indicating the board is valid.

*/