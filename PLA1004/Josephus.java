import java.util.*;


public class Josephus {
    static int  josephussoln(int n, int k){
        if (n==1){
            return 1;
        }
        return (josephussoln(n-1,k)+(k-1))%n+1;
    }
    public static void main(String[] args) {
        int n =5;
        int k =3;
        System.out.println(josephussoln(n, k));
        
    }
}
