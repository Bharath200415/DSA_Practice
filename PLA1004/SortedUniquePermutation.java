import java.util.*;

public class SortedUniquePermutation {
    public static List<String> permuteUnique(String s){
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();

        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        StringBuilder sb = new StringBuilder();
        backtrack(chars, used, sb, result);
        return result;
    }
    private static void backtrack(char[] chars, boolean[] used, StringBuilder sb, List<String> result){
        if (sb.length()==chars.length){
            result.add(sb.toString());
            return;
        }

        for (int i=0;i<chars.length;i++){
            if (used[i]) continue;
            
            //skip duplicates
            if (i>0 && chars[i]==chars[i-1] && !used[i-1]) continue;

            used[i]=true;
            sb.append(chars[i]);
            backtrack(chars,used,sb,result);
            
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
    public static void main (String args[]){
        String str1 = "TSR";
        System.out.println(permuteUnique(str1));;

    }
    
}
