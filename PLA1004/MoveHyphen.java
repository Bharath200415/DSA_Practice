import java.util.*;


public class MoveHyphen{
    public static StringBuilder movehyphen(String str1){
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<str1.length();i++){
            if (str1.charAt(i)=='-'){
                result.insert(0,(char)str1.charAt(i));
            }else{
                result.append(str1.charAt(i));
            }
        }
        return result;

    }
    public static void main (String args[]){
        String s = "I-am-A-Gamer-";
        System.out.println(movehyphen(s));
    }
    
}