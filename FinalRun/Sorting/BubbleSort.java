import java.util.*;
public class BubbleSort{
    static void SortedArr(int[] arr){
        boolean Swapped = false;
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                    Swapped = true;
                }
            }
            if (Swapped==false){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {-1,-7,-32,7,0};
        SortedArr(arr1);
        System.out.println(Arrays.toString(arr1));
        
    }
}