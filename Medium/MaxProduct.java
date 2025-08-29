import java.util.*;
public class MaxProduct {
    public static int maxprod(int[] arr){
        if (arr.length==0){
            return 0;
        }
        int maxsoFar=arr[0];
        int minsoFar=arr[0];
        int result = arr[0];

        for (int i=1;i<arr.length;i++){
            int current = arr[i];
            int prevmax=maxsoFar;
            maxsoFar = Math.max(current,Math.max(prevmax*current, minsoFar*current));
            // minsoFar= Math.min(current, Math.min(prevmax*current, minsoFar*current));
            result = Math.max(result,maxsoFar);

        }
        return result;
    }

    public static int maxprod2(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int maxsofar = arr[0];
        int minsofar= arr[0];
        int result = arr[0];
        for (int i=1;i<arr.length;i++){
            int current = arr[i];
            int prevsofar = maxsofar;
            maxsofar= Math.max(current,Math.max(current*prevsofar, current*minsofar));
            result = Math.max(result,maxsofar);
        }

        return result;
    }

        
    

    public static void main (String args[]){
        int[] arr = {2,5,-15};
        int arr2[] = {1,2,0,3,0};
        System.out.println("max product is : "+maxprod2(arr));
    
    }
    
}
