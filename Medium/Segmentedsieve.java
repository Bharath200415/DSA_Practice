import java.util.*;


public class Segmentedsieve {
    //generate all primes till (rootR)
    static void simpleSieve(int limit, List<Integer> primes) {
        boolean[] mark = new boolean[limit + 1];
        for (int i=0;i<mark.length;i++){
            mark[i]=true;
        }
        // Arrays.fill(mark, true);

        for (int p = 2; p * p <= limit; p++) {
            if (mark[p]) {
                for (int i = p * p; i <= limit; i += p)
                    mark[i] = false;
            }
        }
        for (int p = 2; p <= limit; p++){
            if (mark[p]) primes.add(p);

        }
            
    }

    static void segmentedSieve(int L, int R) {
        int limit = (int) Math.sqrt(R);
        List<Integer> primes = new ArrayList<>();
        simpleSieve(limit, primes);

        boolean[] mark = new boolean[R - L + 1];
        for (int i=0;i<mark.length;i++){
            mark[i]=true;
        }

        for (int p : primes) {
            int start = Math.max(p * p, ((L + p - 1) / p) * p);
            for (int i = start; i<= R; i += p)
                mark[i - L] = false;
        }

        for (int i = 0; i < mark.length; i++){
            if (mark[i] && (i + L) > 1){
                System.out.print((i + L) + " ");
            }
        }
    
    }


    public static void main(String[] args) {
        int L = 10, R = 50; // Example range
        segmentedSieve(L, R);
    }
}
