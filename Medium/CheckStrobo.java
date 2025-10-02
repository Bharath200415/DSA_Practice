import java.util.*;

public class CheckStrobo{
    public static boolean checkifStrobo(String num){
        HashMap<Character,Character> mapgod = new HashMap<>();
        mapgod.put('0','0');
        mapgod.put('1','1');
        mapgod.put('8','8');
        mapgod.put('6','9');
        mapgod.put('9','6');

        int n = num.length();
        for (int i=0,j=(n-1);i<=j;i++,j--){
            char digitleft = num.charAt(i);
            char digitright = num.charAt(j);
            char mapping = mapgod.getOrDefault(digitleft,'-');
            
            if (mapping!=digitright){
                return false;
            }
            if (mapping=='-'){
                return false;
            }

        }
        return true;
    }

    public static void main (String args[]){
        String mString = "88";
        boolean result = checkifStrobo(mString);
        if (result){
            System.out.println("yes this is strobogrammatic");

        }else{
            System.out.println("no, this aint strobogrammatic.");
        }


    }


    
}
