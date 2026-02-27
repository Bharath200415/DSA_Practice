import java.util.*;

public class StringPerformance {
    public static void main(String args[]){
        String series = "";
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series+=ch; //this creates new object during each iteration thus not so optimal
        }
        System.out.println(series);


        //optimal approach: use StringBuilder
        StringBuilder sb = new StringBuilder();

        for (int j=0;j<26;j++){
            char c = (char)('a'+j);
            sb.append(c);
        }

        System.out.println(sb);

    }
    
}
