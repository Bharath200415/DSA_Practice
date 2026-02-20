//tc: O(n^2)
//sc:O(1)

import java.util.*;

public class SelectionSort {

    static void Selection(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            //hello world
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }
    public static void main(String args[]){

        int[] arr = {4,5,1,2,3};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
