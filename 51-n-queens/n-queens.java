class Solution {
    public List<List<String>> solveNQueens(int n) {
   solution sol = new solution();
        return sol.solveNQueens(n);

        
    }
}

class solution {
    public boolean isSafe1(int row, int col, char[][] board, int n) {
        int duprow = row;
        int dupcol = col;

        
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

       
        col = dupcol;
        row = duprow;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

      
        row = duprow;
        col = dupcol;
        while (row < n && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }

    public void solve(int col, char[][] board, List<List<String>> ans, int n) {
        if (col == n) {
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe1(row, col, board, n)) {
                board[row][col] = 'Q';
                solve(col + 1, board, ans, n);
                board[row][col] = '.';
            }
        }
    }

    private List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans, n);
        return ans;
    }
}
