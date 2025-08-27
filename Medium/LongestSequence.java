import java.util.*;
public class LongestSequence {
    public static int LongestSeq(int arr[],int k){
        int zeros=0;
        int left=0;
        int maxlen=0;
        int len;
        
        for (int r=0;r<arr.length;r++){
            if (arr[r]==0){
                zeros++;
            }
            if (zeros>k){
                if (arr[left]==0) zeros--;
                left++;
            }
            len = r-left+1;
            maxlen = Math.max(maxlen,len);
            
        }
        return maxlen;
    }

        
    
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,0,0,1,1,1,1,1,0};
        int k=1;
        System.out.println(LongestSeq(arr, k));
    }
    
}
