import java.util.*;

public class maxhourglass {
    public static int maxSum(int[][] matr1 ){
        int row = matr1.length;
        int col = matr1[0].length;

        if (row<3||col<3){
            System.out.println("Matrix too small");
            System.exit(0);
        }

        int maxsum = Integer.MIN_VALUE;

        for (int i=0;i<matr1.length-2;i++){
            for (int j=0;j<matr1[0].length -2;j++){
                int sum=(matr1[i][j]+matr1[i][j+1]+matr1[i][j+2]+matr1[i+1][j+1]+matr1[i+2][j]+matr1[i+2][j+1]+matr1[i+2][j+2]);
                maxsum= Math.max(maxsum,sum);
            }
        }

        return maxsum;
        
        

    }
    public static void main (String args[]){
        int[][] matr = {
                {1,2,4,5,6},
                {7,5,2,3,6},
                {0,0,0,0,0},
                {7,5,1,3,5},
                {0,0,0,0,0}
            };

        System.out.println(maxSum(matr));

    }
}
