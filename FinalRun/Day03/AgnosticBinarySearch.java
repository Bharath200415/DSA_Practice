import java.util.*;

public class AgnosticBinarySearch {
    static int orderagnosticsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;


        //check whether array is sorted in ascending or desc 
        boolean isAsc= arr[start]<arr[end];
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
                //{34,12,8,7,4}
            }else{
                if (target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }


        return -1;
    }
    public static void main (String args[]){
        int[] arr = {45,23,11,8,7,4};
        int[] arr2 = {12,34,48,53,62};
        System.out.print(orderagnosticsearch(arr2,53));

    }
    
}
