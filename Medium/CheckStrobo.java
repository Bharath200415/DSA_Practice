import java.util.*;

public class CheckStrobo{
    public static boolean checkifStrobo(String num){
        HashMap<Character, Character> mapGod = new HashMap<>();
        mapGod.put('1','1');
        mapGod.put('6','9');
        mapGod.put('0','0');
        mapGod.put('8','8');
        mapGod.put('9','6');
        int n = num.length();
        for (int i=0,j=(n-1);i<=j;i++,j--){
            char digitLeft = num.charAt(i);
            char digitRight= num.charAt(j);

            char mapping = mapGod.getOrDefault(digitLeft,'-');
            if (mapping!=digitRight){
                return false;
            }
            if (mapping=='-'){
                return false;
            }
        
        }
        return true;


    }
    public static void main (String args[]){
        String mString = "11";
        boolean result = checkifStrobo(mString);
        if (result){
            System.out.println("yes this is strobogrammatic");

        }else{
            System.out.println("no, this aint strobogrammatic.");
        }


    }


    
}
