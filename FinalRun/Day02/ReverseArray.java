
import java.util.*;

public class ReverseArray {
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
        
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        

    }
    
    public static void main (String args[]){
        int[] arr = {12,3,4,5,18};
        reverse(arr);
        System.out.print(Arrays.toString(arr));

    }
    
}

