import java.util.*;

public class MoveHyphen{
    public static StringBuilder movehyphen(String str1){
        StringBuilder res = new StringBuilder();
        // int hyphencount = 0;

        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)=='-'){
                // hyphencount++;
                res.insert(0,(char)('-'));

            }else{
                res.append(str1.charAt(i));
            }
        }
        return res;
    }
    public static void main (String args[]){
        String s = "I-am-A-Gamer";
        System.out.println(movehyphen(s));
    }
    
}