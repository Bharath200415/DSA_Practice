public class BoothsShort {
    public static int boothsMultiply(int a, int b) {
        int n = 8; // number of bits we consider (can be 8/16/32 depending on range)
        int A = 0;       // accumulator
        int Q = b;       // multiplier
        int M = a;       // multiplicand
        int qMinus1 = 0; // extra bit

        for (int i = 0; i < n; i++) {
            int Q0 = Q & 1; // least significant bit of Q

            // Step 1: Decide operation
            if (Q0 == 1 && qMinus1 == 0) {
                A = A - M;
            } else if (Q0 == 0 && qMinus1 == 1) {
                A = A + M;
            }

            // Step 2: Right shift (A, Q, qMinus1 together)
            int combined = (A << (n + 1)) | (Q << 1) | qMinus1; // pack A,Q,q-1
            combined >>= 1; // arithmetic shift

            // Extract A, Q, q-1 back
            A = combined >> (n + 1);
            Q = (combined >> 1) & ((1 << n) - 1);
            qMinus1 = combined & 1;
        }

        // Final product = (A << n) + Q
        return (A << n) | Q;
    }

    public static void main(String[] args) {
        int a = 3, b = -4;
        int product = boothsMultiply(a, b);
        System.out.println("Product = " + product); // -12
    }
}