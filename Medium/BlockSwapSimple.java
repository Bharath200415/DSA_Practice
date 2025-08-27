import java.util.*;
public class BlockSwapSimple {
    public static int[] rotateleft(int arr[], int b){
        int n=arr.length;
        if (n<=0||b>n){
            return arr;
        }
        int[] temp = new int[b];
        for (int i=0;i<b;i++){
            temp[i]=arr[i];
        }
        for (int i=0;i<n-b;i++){
            arr[i]=arr[i+b];
            
        }
        //adding the remaining elements from temp stack
        for (int i=0;i<b;i++){
            arr[n-b+i]=temp[i];
        }
        return arr;
        
    }
    public static void main (String args[]){
        int array1[]= {1,2,3,4,5};
        int res[]=rotateleft(array1,2);
        for (int nums: res){
            System.out.print(nums+ " ");
        }

    }
    
}
