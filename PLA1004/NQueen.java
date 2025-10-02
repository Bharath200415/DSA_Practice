import java.util.*;

public class NQueen {
    static int N=4;
    static boolean isSafe(int[][] board, int row, int col){
        //check for column
        for (int i=0;i<row;i++){
            if (board[i][col]==1) return false;
        }
        //check for upper-left diagonal
        for (int i=row-1,j=col-1;i>=0 && j>=0; i--, j--){
            if (board[i][j]==1){
                return false;
            }
        }
        //check for upper-right diagonal
        for (int i=row-1,j=col+1;i>=0 && j<N; i--, j++){
            if (board[i][j]==1) return false;
        }
        return true;
    }
    static void Solve(int[][] board, int row, int[] cols){
        if (row==N){
            System.out.println(Arrays.toString(cols));
            return;
        }

        for (int col=0;col<N;col++){
            if (isSafe(board,row,col)){
                board[row][col]=1;
                cols[row] = col+1;
                Solve(board,row+1,cols);
                board[row][col]=0;
            }
        }
    }
    public static void main(String args[]){
        int[][] board = new int [N][N];
        int[] cols=new int[N];
        Solve(board,0,cols);
    }
}
