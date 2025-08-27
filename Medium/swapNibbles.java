import java.util.*;
public class swapNibbles {
    public static int swapnib(int num){
        int swapnum = ((num&0x0F)<<4|(num&0xF0)>>4);
        return swapnum;

    }
    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int a = sc.nextInt();
        // System.out.println("original string: "+a);
        // System.out.println("updated string: "+swapnib(a));
        int x =10;
        switch (x) {
            case 0:
            System.out.println("yes");
            case 1:
            System.out.println("no dawg");
            default:
            System.out.println("hel yea");
                
        }

    }
}
    

