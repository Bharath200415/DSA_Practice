import java.util.*;

public class Practice2 {
    public static boolean find(String num){
        Map<Character,Character> strobodict = new HashMap<>();
        strobodict.put('0','0');
        strobodict.put('1','1');
        strobodict.put('6','9');
        strobodict.put('8','8');
        strobodict.put('9','6');
        int n = num.length();

        for(int i=0,j=(n-1);i<=j;i++,j--){
            char digitleft = num.charAt(i);
            char digitright = num.charAt(j);
            char mapping = strobodict.getOrDefault(digitleft,'-');
            if (mapping=='-') return false;
            if (mapping!=digitright) return false;

        }
        return true;

    }
    public static void main (String args[]){
        int i = 1;
        switch (i) {
            case 0:
                i++;
            case 1:
                i += 2;
            case 2:
                i += 3;
                break;
            default:
                i += 4;
        }
        System.out.println(i);


    }

    
}
