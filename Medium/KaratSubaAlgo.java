import java.util.*;

public class KaratSubaAlgo{
    public static int karatSuba(int x, int y){
        if (x<10||y<10){
            return x*y;
        }
        int m=Math.max(getNumDigits(x),getNumDigits(y));
        int halfM = m/2;
        int powerof10 = (int) Math.pow(10,halfM);
        int a = x/powerof10;
        int b = x%powerof10;
        int c = y/powerof10;
        int d = y%powerof10;
        int ac = karatSuba(a, c);
        int bd = karatSuba(b, d);
        int abcd = karatSuba(a+b,c+d);
        int result =ac*(int) Math.pow(10,2*halfM)+(abcd-ac-bd)*powerof10+bd;
        return result;

    }
    private static int getNumDigits(int x){
        if (x==0){
            return 1;
        }
        int count = 0;
        while (x>0){
            count++;
            x/=10;
        }
        return count;
    }
    public static void main (String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x = s1.nextInt();
        System.out.print("Enter number 2: ");
        int y = s1.nextInt();
        int product = karatSuba(x, y);
        System.out.println(x+"*"+y+"="+product);

    }

}