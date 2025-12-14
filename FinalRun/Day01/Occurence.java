import java.util.*;

public class Occurence {

    public static void main(String[] args) {
        //count the number of occurences
        
        int count=0;
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.print("enter the digit: ");
        int num = sc.nextInt();
        while (n>0){
            int dig = n%10;
            if (dig==num){
                count++;
            }
            n=n/10;
        }
        System.out.println("the occurences: "+ count);
        
    }

    
}
