class Solution {
    static int countdigits(int num){
        // return Integer.toString(num).length();
        int digitcount = 0;
        while (num!=0){
            digitcount++;
            num/=10;
        }
        return digitcount;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (countdigits(nums[i])%2==0){
                count++;

            }
        }

        return count;

        
    }
}