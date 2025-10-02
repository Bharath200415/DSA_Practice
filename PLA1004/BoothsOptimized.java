import java.util.*;

public class BoothsOptimized { 
    public static int boothMultiply(int multiplicand, int multiplier, int nBits) {
        int A = 0;   // Accumulator
        int Q = multiplier;
        int M = multiplicand;
        int Q_1 = 0; // Extra bit
        int count = nBits;
        while (count > 0) {
            int Q0 = Q & 1; // Least significant bit of Q
            if (Q0 == 1 && Q_1 == 0) {
                A = A - M;
            } else if (Q0 == 0 && Q_1 == 1) {
                A = A + M;
            }
            int combined = (A << (nBits + 1)) | (Q << 1) | Q_1;
            combined = arithmeticRightShift(combined, nBits + nBits + 1);
            A = combined >> (nBits + 1);
            Q = (combined >> 1) & ((1 << nBits) - 1);
            Q_1 = combined & 1;
            count--;
        }
        return (A << nBits) | Q;
    }
    public static int arithmeticRightShift(int value, int bits) {
        return value >> 1; // Java already does arithmetic shift for signed ints
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplicand: ");
        int multiplicand = sc.nextInt();
        System.out.print("Enter multiplier: ");
        int multiplier = sc.nextInt();
        int nBits = 5; // you can adjust (for small numbers 5 bits works)
        int result = boothMultiply(multiplicand, multiplier, nBits);
        System.out.println("Result = " + result + " (Check: " + (multiplicand * multiplier) + ")");
        sc.close();
    }

}
