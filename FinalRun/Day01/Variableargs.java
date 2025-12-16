import java.util.*;

public class Variableargs {
    static void func(int ...v){
        System.out.print((Arrays.toString(v)).getClass().getName());
        for (int a:v){
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        func(12,12,15,260);
        
    }
    
}
