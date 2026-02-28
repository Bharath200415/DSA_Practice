import java.util.*;

//tc: O((1+sqrt(5))/2)^n => (1.618)^n

public class NthFibo {
    static long fiboN(int n){
        double ans = (Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5);
        return (long)ans;
    }
    public static void main (String args[]){
        System.out.println(fiboN(6));

    }
    
}
