import java.util.*;
public class BinaryPalindrome{
    public static boolean checkBinaryPalindrome(int n){
        String s = Integer.toBinaryString(n);
        int length = s.length();
        for (int i=0,j = length-1; i<j;i++, j--){
            if (s.charAt(i)!=s.charAt(j)) return false;

        }

        return true;
    }
    public static void main (String args[]){
        int n = 15;

        boolean result =checkBinaryPalindrome(n);
        if (result==true){
            System.out.println("yes it is a palindrome");
        }else{
            System.out.println("it is not");
        }
    }

}
