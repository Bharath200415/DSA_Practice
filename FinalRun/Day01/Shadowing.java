import java.util.*;

public class Shadowing {
    static int x = 10;

    public static void main(String args[]){
        System.out.println(x);
        int x = 30;
        System.out.print(x);
        //hence variable x from the global state =10 was shadowed and it printed 30 instead

    }
    
}
