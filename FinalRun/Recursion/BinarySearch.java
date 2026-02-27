import java.util.*;
public class BinarySearch {
    static int BS(int[] arr, int start, int end, int target){
        
        if (start>end) return -1;

        int mid = start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (target>arr[mid]){
            return BS(arr,mid+1,end,target);
        }
        if (target<arr[mid]){
            return BS(arr,start,mid-1,target);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,15,20,25,37,40};
        int n = arr.length-1;
        System.out.println(BS(arr,0,n,25));
        System.out.println(7/2);
    }
    
}
