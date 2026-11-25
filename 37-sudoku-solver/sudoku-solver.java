class Solution {
    public void solveSudoku(char[][] board) {
        boolean result = solve(board);
        

        
    }
   boolean isValid(char[][] board,int row,int colum,char num){
    int startrow = (row/3)*3;
    int startcol = (colum/3)*3;
    for(int i = startrow; i<startrow+3; i++){
        for(int j = startcol; j<startcol+3; j++){
            if(board[i][j]==num) return false;
        }
    }
    for(int k =0; k<9; k++){
        if(board[row][k]==num) return false;
    }
     for(int l =0; l<9; l++){
        if(board[l][colum]==num) return false;
    }
    return true;
   }

   boolean solve(char[][] board){
    for(int i = 0; i<board.length; i++){
        for(int j = 0; j<board.length; j++){
            if(board[i][j]=='.'){
                for(char k='1'; k<='9'; k++){
                    if(isValid(board,i,j,k)){
                        board[i][j]=k;
                        if(solve(board)){
                            return true;
                        }else{
                            board[i][j]='.';
                        }
                    }
                }
                return false;
            }
           
        }
    }
    return true;
   }
}