import java.util.*;
public class Karatsubanaive {
    public static int multiply(int x,int y){
        String a = Integer.toString(x);
        String b = Integer.toString(y);
        int result=0;
        for (int i=0;i<b.length();i++){
            int carry=0;
            String int_Res = "";
            for (int j=a.length()-1;j>=0;j--){
                int num = Character.getNumericValue(b.charAt(i))*Character.getNumericValue(a.charAt(j))+carry;
                if (num>9 && j>0){
                    int_Res = Integer.toString(num%10)+int_Res;
                    carry=num/10;
                
                }else{
                    int_Res = Integer.toString(num)+int_Res;
                    carry=0;
                }
            }

            
        } 
    }
    
}
