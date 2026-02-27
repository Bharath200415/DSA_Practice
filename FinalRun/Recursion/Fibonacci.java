
public class Fibonacci{
    //0 1 1 2 3 5 8 13 ...

    static int fibo(int n){


        if (n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    static void classicFibo(int n){
        int n1=0;
        int n2=1;
        for (int i=0;i<n;i++){
            if (i==n-1){
                System.out.println(n1+" ");
            }

            int n3 = n1+n2;
            n1=n2;
            n2= n3;
        } 

    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
        classicFibo(5);
        
    }
}