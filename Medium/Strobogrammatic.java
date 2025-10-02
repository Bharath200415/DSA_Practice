import java.util.*;
public class Strobogrammatic{
    public static ArrayList<String> stroboResult(int n){
        ArrayList<String> result = strobocompute(n, n);
        return result;
    }
    public static ArrayList<String> strobocompute(int n,int length){
        ArrayList<String> result = new ArrayList<>();
        if (n==0){
            result.add("");
            return result;
        }
        if (n==1){
            result.add("0");
            result.add("1");
            result.add("8");
            return result;
        }
        ArrayList<String>middles =  strobocompute(n-2,length);

        for (String mid: middles){
            if (n!=length){
                result.add("0"+mid+"0");
            }

            result.add("8"+mid+"8");
            result.add("9"+mid+"6");
            result.add("6"+mid+"9");
            result.add("1"+mid+"1");
            
        }
        return result;   
        
        
    }
    public static void main(String args[]){
        int n=3;
        for (String a:stroboResult(n)){
            System.out.print(a+" ");
        }
    }

}

