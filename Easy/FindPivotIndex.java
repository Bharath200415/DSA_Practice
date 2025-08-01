// https://leetcode.com/problems/find-pivot-index/description/

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num:nums){
            total+=num;
        }
        int leftTotal = 0;
        for (int i=0;i<nums.length;i++){
            int rightTotal = total - leftTotal-nums[i];
            if (rightTotal==leftTotal){
                return i;
            }
            leftTotal+=nums[i];
        }
        return -1;
    }
}

class FindPivotIndex extends Solution{
    public static void main (String args[]){
        Solution a = new Solution();
        int arr1[] = {1,7,3,6,5,6};
        int result = a.pivotIndex(arr1);
        System.out.println(result);


    }
}
