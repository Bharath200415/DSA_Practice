import java.util.*;

public class Combinations {
    static long factorial (int n){
        long fact = 1;
        for (int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    static long nCr(int n, int r){
        return factorial(n)/factorial(r)*factorial(n-r);

    }

    public static void main (String args[]){
        int n=5; 
        int r=3;
        System.out.println("Number of combinations: "+nCr(n,r));
        
    }
    
}
