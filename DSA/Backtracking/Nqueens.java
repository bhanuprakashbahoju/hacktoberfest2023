// What is N-Queen's problem?
// N Queen problem demands us to place N queens on a N x N chessboard so that no queen can attack any other queen directly.

// Problem Statement: We need to find out all the possible arrangements in which N queens can be seated in each row and each column so that all queens are safe.
//   The queen moves in 8 directions and can directly attack in these 8 directions only.

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {

        // base case
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    // we can also isSafe() method using

    // static boolean check(int row,int col){
    // for(int i=0;i<row;i++){
    // int prow=i; //previous row
    // int pcol=queen[i];
    // if(pcol==col || abs(col-pcol)==abs(row-prow))
    // return false;
    // else
    // return true;
    // }

    // }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
