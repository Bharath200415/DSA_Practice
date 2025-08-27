import java.util.*;
public class CRT {
    static int calCRT(int []a,int m[], int n, int p){
        int x=0;
        for (int i=0;i<n;i++){
            int M=p/m[i];
            int y=0;
            for (int j=0;j<m[i];j++){
                if ((M*j)%m[i]==1){
                    y=j;
                    break;
                }
            }
            x=x+a[i]*M*y;
        } 
        return x%p;
    }
    public static void main (String args[]){
        
        int[] a = {2,3,1};
        int[] m = {3,4,5};
        int n = a.length;
        int x[] = new int[5];

        int p = 1;
        for (int b:m){
            p=p*b;
        }
        int result = calCRT(a, m, n, p);
        System.out.println(result);
    }
}
