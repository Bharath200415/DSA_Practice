
import java.util.*;
//array objects are in stored in heap
//heap objects are not allocated in continuous blocks 
//dynamic memory allocation: storage is allocated at the runtime
//array objects may not be continuous in java ->depends on jvm 

public class Array {
    public static void main(String[] args) {
        System.out.print("Hello world");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(a);
        sc.close();
    }
}
