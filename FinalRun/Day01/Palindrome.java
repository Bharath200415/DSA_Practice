import java.util.*;

public class Palindrome {
    public static void main (String args[]){
        //palindrome of a num
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");

        int num = sc.nextInt();
        int revnum=0;

        while (num>0){
            int digit = num%10;
            revnum = revnum*10+digit;
            num/=10;
        }
        System.out.print(revnum);
    }
    
}
