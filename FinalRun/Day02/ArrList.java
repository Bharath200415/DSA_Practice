import java.util.*;

public class ArrList {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        for (int a:list){
            System.out.print(a);
        }

        //multi dimensional array list: 
        ArrayList<ArrayList<Integer>> listnested = new ArrayList<>();
        for (int i=0;i<3;i++){
            listnested.add(new ArrayList<>());
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("enter the value: ");
                listnested.get(i).add(sc.nextInt());
            }
        }
    }
    
}
