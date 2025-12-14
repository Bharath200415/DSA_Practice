import java.util.*;

public class Practice01 {

    public void switchtest(){
        System.out.print("enter fruit name: ");
        Scanner sc  = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "mango"->System.out.print("king");
            case "apple"->System.out.print("queen");
                
            default->System.out.println("small fruit");
        }

    }

    public void dayswitch(){
    System.out.print("enter the day: ");
    Scanner sc  = new Scanner(System.in);
    int day = sc.nextInt();

    switch(day){
        case 1,2,3,4,5->System.out.print("weekday");
        case 6,7->System.out.print("weekend");
            
        default->System.out.println("invalid");
    }

    }

    public void nestedswitch(){
        System.out.println("enter empid: ");
        Scanner sc  = new Scanner(System.in);
        int empId = sc.nextInt();

        System.out.print("enter department: ");

        String dept = sc.next();

        switch(empId){
            case 1->System.out.println("bharath");
            case 2->System.out.println("ram");
            case 3->System.out.println("raman");
            case 4->{switch (dept){
                    case "IT"->System.out.print("IT Department");
                    case "CS"->System.out.print("CS Department");
                    default->System.out.println("enter valid dept");
                }}
            default->System.out.print("invalid empId");
                    
        }

    }

    public static void main(String[] args) {
        Practice01 obj = new Practice01();
        obj.nestedswitch();
     }
    
}
