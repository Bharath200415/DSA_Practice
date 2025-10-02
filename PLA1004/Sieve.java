import java.util.*;
public class Sieve{
    static void simpleSieve(int limit, ArrayList<Integer> primes) {
        boolean[] mark = new boolean[limit+1];
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
        
        for (int p = 2; p <limit; p++){
            if (mark[p]) primes.add(p);

        }
        for (int a:primes){
            System.out.print(a+" ");
        }
            
    }
    public static void main(String[] args) {
        ArrayList<Integer> newar =new ArrayList<>();
        simpleSieve(19, newar);
        
    }
}