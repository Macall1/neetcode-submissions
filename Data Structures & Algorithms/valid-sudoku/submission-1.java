class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++){
            List<Character> row = new ArrayList<>();
            for(int j = 0; j < 9; j++){
                if(row.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                row.add(board[i][j]);
            }
        }
        for (int j = 0;j<9;j++){
            List<Character> col = new ArrayList<>();
            for(int i = 0;i<9;i++){
                if(col.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                col.add(board[i][j]);
            }
        }
        for(int k = 0; k < 9; k=k+3){
            for(int l = 0; l < 9; l=l+3){
                List<Character> box = new ArrayList<>();
                for (int i = k; i < k+3; i++){
                    for(int j = l; j < l+3; j++){
                        if(box.contains(board[i][j]) && board[i][j] != '.'){
                            return false;
                        }
                        box.add(board[i][j]);
                    }
                }

            }

        }

        return true;
    }
}
