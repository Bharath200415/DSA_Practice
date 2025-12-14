import java.util.*;

//find the nth fibonacci number
public class Fibonacci{

    public static void main (String args[]){
        int a = 0;
        int b = 1;
        System.out.print("enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // for (int i=0;i<num;i++){
        //     System.out.print(a+" ");
        //     int temp = a+b;
        //     a=b;
        //     b=temp;

        // }
        
        // 0 , 1, 1, 2, 3, 5


        for (int i=0;i<num-1;i++){
            int temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);

    }


}