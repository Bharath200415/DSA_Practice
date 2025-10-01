import java.util.*;

public class Manachersoptimized {
    private static String Preprocess(String s){
        StringBuilder sb = new StringBuilder();
        sb.append('^');
        for (int i = 0;i<s.length();i++){
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append("#$"); //end boundary
        return sb.toString();
    }

    public static String LongestPalindrome(String s){
        String T = Preprocess(s);
        int n = T.length();
        int[] P = new int[n];
        int c = 0, r=0;
        int maxlen = 0;
        int centerIndex = 0;
        for (int i=1;i<n-1;i++){
            int mirr = 2*c-i;
            if (i<r){
                P[i]=Math.min(r-i,P[mirr]);
            }
            while (T.charAt(i+(1+P[i])) == T.charAt(i-(1+P[i]))){
                P[i]++;

            }
            if (i+P[i]>r){
                c=i;
                r = i+P[i];
            }
            if (P[i]>maxlen){
                maxlen = P[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxlen)/2;
        return s.substring(start,start+maxlen);
        
    }
    public static void main(String args[]){
        String str1 = "babad";
        System.out.println(LongestPalindrome(str1));
    }
}
