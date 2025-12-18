package src.FinalRun.Day03;
import java.util.*;

public class CharSearch {
    static boolean search(String str,char target){
        if (str.length()==0){
            return false;
        }

        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }

    static int searchindex(String str,char target){
        if (str.length()==0){
            return -1;
        }

        for (int i=0;i<str.length();i++){
            if (target==str.charAt(i)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String name = "Bharath";
        System.out.println(searchindex(name,'a'));
    }
}
