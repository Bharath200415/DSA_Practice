import java.util.*;

public class SplitarraySum {
    static int splitcount(int[] nums, int midsum){
        int sections = 1;
        int initial = 0;
        for (int i=0;i<nums.length;i++){
            if (initial+nums[i]<=midsum){
                initial+=nums[i];
            }else{
                sections+=1;
                initial = nums[i];
            }
        }
        return sections;
    }
    
    static int splitArray(int[] nums, int k){
        int start = 0;
        int end =0;
        for (int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }

        while (start<=end){
            int mid = start+(end-start)/2;

            //calculate how many pieces we can divide this in with max sum
            int pieces = splitcount(nums,mid);
            if (pieces>k){
                start = mid+1;
            }else{
                end= mid-1;
            }
        }
        return start; //in the end, start==end
    }

    public static void main(String args[]){
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    
}
