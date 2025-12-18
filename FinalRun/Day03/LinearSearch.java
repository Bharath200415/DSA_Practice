package src.FinalRun.Day03;
public class LinearSearch {
    static int findlinear(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;

    }
    public static void main (String args[]){
        int[] arr = {1,2,4,3,4,54};

        System.out.println(findlinear(arr,54));
    }
    
}
