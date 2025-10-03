// 1. If length of string is even, then the frequency of each character in the string must be even. 
// 2. If the length is odd then there should be one character whose frequency is odd and all other chars must have even frequency and at-least one occurrence of the odd character must be present in the middle of the string.

// Time complexity: O(n) | 
public class LexicographicalPalindrome{
    static String findpalindromicString(String str1){
        //aab
        String str = str1.toLowerCase();
        int[] freq = new int[26];
        for (char c: str.toCharArray()){
            freq[c-'a']++;
        }

        int len = str.length();

        //checking for the existence of any odd character occurence
        int countOdd = 0;
        for (int f:freq){
            if (f%2!=0){
                countOdd++;
            }
        }

        //cases where no palindrome can be formed
        if ((len%2==0 && countOdd!=0) || (len%2==1 && countOdd!=1)){
            return "No palindromic string ";
        }

        StringBuilder front = new StringBuilder();
        StringBuilder rear = new StringBuilder();
        String odd = "";
        //aabcc

        for (int i = 0;i<26;i++){
            if (freq[i]%2!=0){
                odd = String.valueOf((char)(i+'a'));
                freq[i]--;
            }
            for (int j=0;j<freq[i]/2;j++){
                front.append((char)(i+'a'));
                rear.insert(0,(char)(i+'a'));
            }
        }
        return front+odd+rear.toString();
    }

    static String lexOptimized(String str1){
        String str = str1.toLowerCase();
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        int len = str.length();
        
        int countOdd = 0;
        for (int f : freq) {
            if (f % 2 != 0) {
                countOdd++;
            }
        }

        if ((len % 2 == 0 && countOdd != 0) || (len % 2 == 1 && countOdd != 1)) {
            return "No palindromic string";
        }
        
        StringBuilder leftHalf = new StringBuilder();
        String odd = "";
        
        // Build left half
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                odd = String.valueOf((char)(i + 'a'));
                freq[i]--;
            }
            for (int j = 0; j < freq[i] / 2; j++) {
                leftHalf.append((char)(i + 'a'));
            }
        }
        
        // Build final palindrome: leftHalf + middle + reverse(leftHalf)
        StringBuilder result = new StringBuilder();
        result.append(leftHalf);
        result.append(odd);
        result.append(leftHalf.reverse());
        
        return result.toString();  
    }

	public static void main(String[] args) {
        String res = findpalindromicString("aabcc");
        System.out.println(res);

	}

}