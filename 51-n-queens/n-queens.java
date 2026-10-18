import java.util.*;

class Solution {

    public boolean isSafe(int row, int col, char[][] board, int n) {

        // Check upper diagonal (left)
        int duprow = row;
        int dupcol = col;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }

        // Check left side of the same row
        col = dupcol;

        while (col >= 0) {
            if (board[duprow][col] == 'Q') {
                return false;
            }
            col--;
        }

        // Check lower diagonal (left)
        row = duprow;
        col = dupcol;

        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    public void solve(int col, char[][] board,
                      List<List<String>> ans, int n) {

        // Base case: All queens have been placed
        if (col == n) {
            List<String> solution = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }

            ans.add(solution);
            return;
        }

        // Try placing a queen in every row of this column
        for (int row = 0; row < n; row++) {

            if (isSafe(row, col, board, n)) {

                board[row][col] = 'Q';

                solve(col + 1, board, ans, n);

                // Backtracking: Remove the queen
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty cells
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(0, board, ans, n);

        return ans;
    }
}