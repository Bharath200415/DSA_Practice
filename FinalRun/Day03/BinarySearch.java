import java.util.*;

public class BinarySearch {

    //best time complexity: O(1)
    //Worst time complexity: O(n)
    
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            // int mid = (start+end)/2; //start+end might exceed the int limit 
            int mid = start+(end-start)/2;

            if (target<arr[mid]){
                end = mid-1;
            }else if (target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //max comparisons: n (no. of elements)
        //Steps: 1. find the middle element in a sorted array
        //2: if target>middle-> search in the right else search in left
        //3. if target==middle then element=ans;
        
        int[] arr = {12,3,4,8,14,12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarysearch(arr,12));

        
    }
    
}
