import java.util.*;
public class KaratSubaAlgo{
    public static int karatsuba(int x, int y){
        if (x<10 || y<10){
            return x*y;
        }
        int m = Math.max(getsize(x),getsize(y));
        int half = m/2;
        int powerof10 = (int)Math.pow(10,half);
        int a = x/powerof10;
        int b = x%powerof10;
        int c = y/powerof10;
        int d = y%powerof10;
        int ac = karatsuba(a,c);
        int bd = karatsuba(b,d);
        int abcd = karatsuba(a+b,c+d);
        int res = ac*(int)Math.pow(10,2*half)+(abcd-ac-bd)*powerof10+bd;
        return res;

    }
    private static int getsize(int a){
        int count=0;
        if (a==0){
            return 1;
        }
        while (a>0){
            count+=1;
            a/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int result = karatsuba(112,123);
        System.out.println(result);

    }
}