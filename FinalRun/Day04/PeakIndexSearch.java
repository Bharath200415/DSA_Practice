public class PeakIndexSearch{
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
    
        //[0,10,5,2]
        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end=mid;
            }
        }

        return start; //in the end, start==end and pointing to the largest number

    }
    public static void main(String args[]){
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
} 

