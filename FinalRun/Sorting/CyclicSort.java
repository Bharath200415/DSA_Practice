
import java.util.*;
public class CyclicSort {
    static void Sort(int[]arr){
        int i=0;

        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[correctIndex]!=arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }

    }
    public static void main (String args[]){
        int[] arr = {2,1,4,3,5};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
