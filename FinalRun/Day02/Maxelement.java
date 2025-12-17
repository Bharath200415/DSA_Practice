import java.util.*;

public class Maxelement {
    static int max(int[] arr){
        int maxval = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>maxval){
                maxval = arr[i];
            }

        }
        return maxval;
    }
    
    public static void main (String args[]){
        int[] arr = {12,3,4,5,18};
        System.out.println(max(arr));

    }
    
}
