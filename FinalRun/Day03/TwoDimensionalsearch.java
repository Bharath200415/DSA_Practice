import java.util.*;

public class TwoDimensionalsearch {
    
    static int[] search2d(int[][] arr,int target){

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (target==arr[row][col]){
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[][] arr = {
            {23,1,2},
            {12,3,54,2},
            {22,53,1},
            {1,2,3,4,5}
        };
        int[] result = search2d(arr,53);
        if (result.length==0){
            System.out.println("value not present in array");
        }else{
            System.out.print("element found in:"+(result[0]+1)+"row & "+(result[1]+1)+"column");
        }

        
    }
    
}
