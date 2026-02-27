public class GCD {

    static int gcd_compute(int n, int n2){
        
        int min=n;
        if (n>n2){
            min=n2;
        }
        int gcd=1;
        for (int i=2;i<=min;i++){
            if (n%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
    public static void main(String args[]){
        System.out.println(gcd_compute(30,42));
    }
    
}
