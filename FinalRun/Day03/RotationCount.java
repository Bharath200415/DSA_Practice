import java.util.*;

public class RotationCount {
    static int findCount(int[] nums){
        int start= 0;
        int end = nums.length-1;

        if (nums[start]<=nums[end]){
            return -1;
        }

        while (start<end){
            int mid = start+(end-start)/2;
            if (nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String args[]){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findCount(arr));
    }

    //[4,5,6,7,0,1,2] -> no. of rotations = (pivot_index+1)
}
