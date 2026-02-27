import java.util.*;

public class PalindromicString {

    static boolean isPalindrome(String t){  
        int i=0;
        int j = t.length()-1;
        String s=t.toLowerCase();
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s = "abasc";
        System.out.println(isPalindrome(s));


    }
    
}
