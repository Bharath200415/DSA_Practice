import java.util.*;

public class Manachers{
    //Brute force
    static boolean manachersfunc(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestpalindrome(String s){
        int n = s.length();
        String longest = "";

        for (int i=0;i<n;i++){
            for (int j=i+1;j<=n;j++){
                String sub = s.substring(i,j);
                if (manachersfunc(sub) && sub.length()>longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String st = "abaxabaxabb";
        System.out.println(longestpalindrome(st));
        // System.out.println(st.substring(0,2));

    }
}