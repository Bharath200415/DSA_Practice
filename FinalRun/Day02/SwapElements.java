import java.util.*;

public class SwapElements {
    static int[] swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;

    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,8,3,2};
        System.out.print(Arrays.toString(swap(arr,1,3)));
        
    }
}
