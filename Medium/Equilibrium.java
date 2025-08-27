//Time complexity: 0(n) 
//Space Complexity: O(1)
import java.util.*;
public class Equilibrium {
    public static void findEquilibriumIndex(int[] arr) {
        // null or empty array.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }
        int totalsum=0;
        boolean found =false;
        for (int num:arr){
            totalsum+=num;
        }
        //now we'll have to check 
        int leftsum=0;
        for (int i=0;i<arr.length;i++){
            int rightsum = totalsum-leftsum-arr[i];
            
            if (leftsum==rightsum){
                System.out.println("found the element at: "+ (i+1));
                found=true;
            }
            leftsum +=arr[i];
        }
        if (found==false){
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        findEquilibriumIndex(arr); //Expected: Equilibrium index found at position: 3

    }

}
    
