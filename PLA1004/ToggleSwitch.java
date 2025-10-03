import java.util.*;

public class ToggleSwitch{
    public static void main(String args[]){
        int n=10;
        boolean[] doors = new boolean[n+1];
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j+=i){
                doors[j]=!doors[j];
            }
        }
        System.out.println("Doors that remain open: ");
        for (int i=1;i<=n;i++){
            if (doors[i]){
                System.out.print(i+" ");
            }
        }

    }
}