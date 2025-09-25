// 1. If length of string is even, then the frequency of each character in the string must be even. 
// 2. If the length is odd then there should be one character whose frequency is odd and all other chars must have even frequency and at-least one occurrence of the odd character must be present in the middle of the string.

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
        String odd = " ";

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

	public static void main(String[] args) {
        String res = findpalindromicString("Malayalam");
        System.out.println(res);
    
		
	}

}