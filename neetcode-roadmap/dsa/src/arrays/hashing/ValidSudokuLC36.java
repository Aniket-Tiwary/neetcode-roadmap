package arrays.hashing;

import java.util.HashSet;

public class ValidSudokuLC36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> rowTemp = new HashSet<>();
            HashSet<Character> colTemp = new HashSet<>();
            for(int j=0;j<9;j++){
                if(rowTemp.contains(board[i][j])){
                    return false;
                }
                if(board[i][j] != '.'){
                    rowTemp.add(board[i][j]);
                }
                if(colTemp.contains(board[j][i])){
                    return false;
                }
                if(board[j][i] != '.'){
                    colTemp.add(board[j][i]);
                }
            }
        }
        for(int stepI=0;stepI<9;stepI+=3){
            for(int stepJ=0;stepJ<9;stepJ+=3){
                HashSet<Character> miniBlock = new HashSet<>();
                for(int i=stepI;i<stepI+3;i++){
                    for(int j=stepJ;j<stepJ+3;j++){
                        if(miniBlock.contains(board[i][j])){
                            return false;
                        }
                        if(board[i][j] != '.'){
                            miniBlock.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
}
