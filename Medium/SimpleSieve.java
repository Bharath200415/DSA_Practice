import java.util.*;

public class SimpleSieve{
    public static void Sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        for (int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        // isPrime[0]=isPrime[1]=false;

        for (int i=2;i*i<=n;i++){
            if (isPrime[i]){
                // Marking multiples of i starting from i*i as non-prime
                for (int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }

            }
        }
        
        System.out.print("Prime numbers upto "+n+":");
        int count=0;
        for (int i=2;i<=n;i++){
            if (isPrime[i]){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("The size is: "+count);
        System.out.println();
    }
    public static void main (String args[]){
        int num=14;
        Sieve(num);
    }
}