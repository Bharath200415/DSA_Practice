import java.util.*;

public class Armstrong {
    static int armstrcheck(int a,int p){
        int temp = a;
        int rev = 0;
        while (a>0){
            int digits = a%10;
            rev =(int)Math.pow(digits,p)+rev;
            a/=10;

        }
        if (rev==temp){
            return temp;
        }else{
            return -1;

        }
        
        

    }

    public static void main(String[] args) {
        System.out.print(armstrcheck(153,3));

    }
    
}
