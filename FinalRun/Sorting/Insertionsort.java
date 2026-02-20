import java.util.*;

public class Insertionsort{
    static void Sort(int[]arr){
        int n = arr.length;

        for (int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
    public static void main (String args[]){
        int[] arr = {5,4,1,2,3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));


    }


}