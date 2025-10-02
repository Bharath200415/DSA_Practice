import java.util.*;
public class AliceappleTree {
    public static int Minapples(int m,int k, int n, int s, int w, int e){
        if (m<=s*k){
            return m;
        }
        else if (m<=s*k+e+w){
            return s*k+(m-s*k);
        }
        else{
            return -1;
        }

    }
    public static void main (String args[]){
        int m =17; //no. of apples to be collected
        int k =15; //no.of apples in each tree
        int n=0; //no. of trees in north
        int s=1; //no. of trees in south
        int w=1; //no .of trees in west
        int e=1; // no. of trees in east
        System.out.println(Minapples(m,k,n,s,w,e));

    }
    
}
