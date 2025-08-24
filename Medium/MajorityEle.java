public class MajorityEle{
    static void checkEle(int arr[]){
        int n = arr.length;
        int maxCount=0;
        int index=-1;
        for (int i=0; i<n;i++){
            int count =0;
            for (int j =0;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount=count;
                index = i;
            }

        }
        if (maxCount>n/2){
            System.out.println(arr[index]);
                

        }else{
            System.out.println("No majority elements");
        }
    }
    
    //moore voting algorithm:
    public static int optimalcheck(int arr[]){
        int n = arr.length;
        int element=-1;
        int count=0;
        for (int num:arr){
            if (count==0){
                element=num;
                count=1;
            }
            else if(num==element) {
                count++;
                
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num:arr){
            if (num==element){
                count++;
            }
        }
        if (count>n/2){
            return element;
        }else{
            return -1;
        }

    }    
    public static void main(String args[]){
        int[] arr={1,2,3,1,1,1,1};
        System.out.println(optimalcheck(arr));


    }
    

}