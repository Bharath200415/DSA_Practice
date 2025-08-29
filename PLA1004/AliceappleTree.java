import java.util.*;
public class AliceappleTree {
    public static int Minapples(int m,int k, int n, int s, int w, int e){
        if (m<=s*k){
            return m;
        }
        else if (m<=s*k+e+w){
            return s*k+(m-s*k)*k;
        }
        else{
            return -1;
        }
        

    }
    public static void main (String args[]){
        int m =17;
        int k =15; 
        int n=0;
        int s=1;
        int w=1;
        int e=1;
        System.out.println(Minapples(m,k,n,s,w,e));

    }
    
}
