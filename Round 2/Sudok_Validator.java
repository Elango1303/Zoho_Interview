public class Sudok_Validator {

    public static boolean isValidSudoku(int[][] bo,int row,int col ,int key) {


        for (int i = 0; i < 9; i++) {
            if (i != col && bo[row][i] == key) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (i != row && bo[i][col] == key) return false;
        }

        int temprow = row - row % 3;
        int tempcol = col - col % 3;

        for (int k = temprow; k < temprow + 3; k++) {
            for (int j = tempcol; j < tempcol + 3; j++) {
                if (!(k == row && j == col) && bo[k][j] == key) return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {

        int[][] board = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };
        boolean ans = true;
        outer:
       for(int i = 0 ; i < board.length ; i++){
           for (int j = 0; j < board[i].length; j++) {
                ans = isValidSudoku(board,i,j,board[i][j]);

               if(!ans){
                   System.out.println("the give bord is false....");
                   break outer;
               }
           }
       }
       if(ans == true) System.out.println("the given box is ture....");
    }
}