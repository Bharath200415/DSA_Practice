public class BinaryPalindrome {
    static boolean checkPalindrome(int n){
        String s = Integer.toBinaryString(n);
        int i=0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        };
        return true;

    }
    public static void main (String args[]){
        int n = 10;
        System.out.println(checkPalindrome(n));
    }
}
