import java.util.*;
class TwoDArraySearch{
    static int[] search(int [][] matrix, int target){
        int r=0;
        int c = matrix.length-1;
        
        while (r<matrix.length && c>=0){
            if (matrix[r][c]==target){
                return new int[]{r+1,c+1};
            }
            if (matrix[r][c]<target){
                r++;

            }else{
                c--;

            }
        }
        return new int[]{-1,-1};

    }
    public static void main (String args[]){
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {30,34,38,50}
        };
        
        int[] a = (search(arr,37));
        for (int num:a){
            System.out.print(num+ " ");
        }
    }
}