
import java.util.*;

class Funct{
    // void functgcd(int num1,int num2){
    //     int gcd=1;
    //     int minmnum = Math.min(num1,num2);

    //     for (int i=1;i<=minmnum;i++){
    //         if (num1%i==0 && num2%i==0){
    //             gcd=i;
    //         }
    //     }
    //     System.out.println("gcd is:"+gcd);

    // }
    // void printfactors(int num){
    //     for (int i=1;i<num;i++){
    //         if (num%i==0){
    //             System.out.print(i+" ");
    //         }
    //     }
    // }



    public void getFactors(int num){
        if (num==0){
            System.out.print("There are infinite factors");
        }
        if (num==1){
            System.out.print("one is the factor");
        }
        for (int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.print(i+", ");
            }
        }
        for (int i=(int)(Math.sqrt(num));i>=1;i--){
            if (num%i==0 && i!=num/i){
                System.out.print(num/i);
                if (i>1) System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void pattern1(int num){
        for (int i=num;i>0;i--){
            for (int j=num;j>0;j--){
                System.out.print(num+" ");
                
            }
            num--;
            System.out.println();
        }

    }
    public void pattern1rev(int num){
        for (int i=1;i<num;i++){
            for (int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    public void Question6(int num){
        for (int i=1;i<=(num);i++){

            for (int j=1;j<=num;j++){
                if (i%2!=0){
                    if (j==num){
                        System.out.print(i+1+" ");

                    }
                    else{
                        System.out.print(i+" ");
                    }
                }else{
                    if (j==1){
                        System.out.print((i+1)+" ");
                    }
                    else{
                        System.out.print(i+" ");
                    }

                }
               
            }
            System.out.println();
        }
    }


    
}


public class Practice {
    public static void main(String[] args) {
        int num=5;
        // int num2 =20;
        Funct a = new Funct();
        a.Question6(num);


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=2;
        // while (n>0){
        //     System.out.print(sum+" ");
        //     sum=(sum*2)+1;
        //     n--;
        // }
        // sc.close();


    }

}
