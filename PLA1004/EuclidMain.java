public class EuclidMain {
    public static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int gcd2(int a, int b){
        while (b!=0){
            int temp =b;
            b = a%b;
            a=temp;
        }
        return a;

    }
    public static void main(String[] args) {
        System.out.println(gcd(35,15));
    }
    
}
