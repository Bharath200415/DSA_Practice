import java.util.*;
public class LeaderArray {
    public static void findLeader(int[] arr){
        int n =arr.length;
        if (arr == null||arr.length==0){
            System.out.println("empty array");
            return;
        }
        int maxsoFar =arr[arr.length-1];
        System.out.print("The leaders in this array are: ");
        System.out.print(maxsoFar+" ");
        for (int i=n-2;i>=0;i--){
            if (arr[i]>maxsoFar){
                maxsoFar=arr[i];
                System.out.print(maxsoFar+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,4,5};
        findLeader(arr);

    }
}
