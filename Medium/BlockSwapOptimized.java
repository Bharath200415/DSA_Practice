import java.util.*;

public class BlockSwapOptimized {
    
    // Recursive Block Swap Algorithm
    static void blockswap(int[] arr, int start, int block, int n) {
        if (block <= 0 || block >= n) return;

        int sizeA = block;
        int sizeB = n - block;

        // Case 1: A and B are equal size
        if (sizeA == sizeB) {
            swap(arr, start, start + sizeA, sizeA);
            return;
        }

        // Case 2: A is smaller
        if (sizeA < sizeB) {
            swap(arr, start, start + n - sizeA, sizeA);
            blockswap(arr, start, block, n - sizeA);
        } 
        // Case 3: B is smaller
        else {
            swap(arr, start, start + sizeA, sizeB);
            blockswap(arr, start + sizeB, block - sizeB, sizeA);
        }
    }

    // Utility swap
    public static void swap(int[] arr, int f, int s, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[f + i];
            arr[f + i] = arr[s + i];
            arr[s + i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 18, 21, 19};
        int block = 2;

        System.out.println("Original array: " + Arrays.toString(arr));
        blockswap(arr, 0, block, arr.length);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}