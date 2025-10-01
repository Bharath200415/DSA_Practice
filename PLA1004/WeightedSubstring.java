import java.util.*;

public class WeightedSubstring{
    static int distinctsub(String P, String Q, int K, int N){
        HashSet<String> res  = new HashSet<String>();

        for (int i = 0;i<N; i++){
            int sum = 0;
            String s = "";
            
            for (int j=i;j<N;j++){

                int pos = P.charAt(j)-'a';
                sum+= Q.charAt(pos)-'0';
                s+=P.charAt(j);

                if (sum<=K){
                    res.add(s);
                }else{
                    break;
                }
            }
        }
        return res.size();
    }
    public static void main(String[] args) {
        String P = "abcde";
        String Q = "12345678912345678912345678";
        int K = 5;
        int N = P.length();

        System.out.print(distinctsub(P, Q, K, N));
    }

}