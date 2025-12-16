import java.util.*;

public class PrimeCheck {

    static boolean isPrime(int n){

        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeOptimized(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }

    public static void main(String args[]){
        //prime number is the one which gets divided by itself and 1 only
        System.out.print(isPrime(2));
    }
    
}
