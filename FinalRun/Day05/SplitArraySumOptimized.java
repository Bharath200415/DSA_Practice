import java.util.*;

public class SplitArraySumOptimized {
    static int splitArray(int[] nums, int k){
        int start = 0;
        int end =0;
        for (int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end+=nums[i];
        }

        while (start<=end){
            int sum = 0;
            int splits=1;

            int mid = start+(end-start)/2;

            for(int num:nums){
                if (num+sum>mid){
                    splits+=1;
                    sum = num;
                }else{
                    sum+=num;
                }
            }
            if (splits>k){
                start = mid+1;
            }else{
                end= mid-1;
            }

            //calculate how many pieces we can divide this in with max sum
        }
        return start; //in the end, start==end
    }
    
}

    public static void main(String args[]){
        int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    
}
