
public class BoyerMoore {
    public static int optimalcheck(int arr[]){
        int n=arr.length;
        int element=-1;
        int count=0;
        for(int num:arr){
            if(count==0){
                element=num;
                count=1;
            }
            else if(num==element){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num:arr){
            if(num==element){
                count++;
            }
        }
        if(count>n/2){
            return element;
        }else{
            return -1;
        }
    }
    public static void main (String args[]){
        int[] arr1 = {1,1,1,2,1,3,5};
        System.out.println(optimalcheck(arr1));

    }
    
}
