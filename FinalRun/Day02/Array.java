
import java.util.*;
//array objects are in stored in heap
//heap objects are not allocated in continuous blocks 
//dynamic memory allocation: storage is allocated at the runtime
//array objects may not be continuous in java ->depends on jvm 
// new is used to create an object 

//datatype reference_variable = new array[size_of_array]

public class Array {
    //primitives: somthing that cannot be broken down like int,char,bool
    //non primitives: something that can be broken down like string,array,object
    public static void main(String[] args) {
        System.out.print("Hello world");
        int[] newar = {12,23,4,5};
        System.out.print(Arrays.toString(newar));
       
    }
}
