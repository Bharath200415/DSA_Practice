import java.util.*;

public class Infinitearraysearch {
    
    //we'll search chunk by chunk by doubling the range in each iteration
    static int searchchunks(int[] arr, int target){
        int start =0;
        int end =1;

        while (target>arr[end]){ 
            int temp= end+1;
            end = end+2*(end-start+1);
            start = temp;
        }

        return search(arr,target,start,end);
    }
    
    static int search(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end= mid-1;

            }else if (target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;


    }

    public static void main (String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,14};
        int target = 6;
        System.out.println(searchchunks(arr, target));
        int res = (7+4)/2;
        System.out.println(res);

    }
}
