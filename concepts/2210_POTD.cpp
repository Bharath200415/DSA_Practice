#include <bits/stdc++.h>
#include <vector>
using namespace std;

class Solution{
    public:
    int countHillvalley(vector<int>& nums){
        int length = nums.size();
        int count = 0;
        for (int i=1;i<(length-1);i++){
            if (nums[i-1]==nums[i]){
                continue;
            }
            
            int right = i+1;
            while (i<(length-1) && nums[i]==nums[right]){
                right++;

            }
            int left = i-1;
            while (i>=0 && nums[left]==nums[i]){
                left--;

            }
            if (left>=0 && right<(length)){
                if (nums[i]>nums[right] && nums[i]>>nums[left]){
                    count++;
                }else if(nums[i]<nums[left] && nums[i]<nums[right]){
                    count++;

                }
            }
            
        }
        return count;

    }
};

int main(){
    vector<int> arr = {2,4,1,1,6,5};
    Solution a;
    int res = a.countHillvalley(arr);
    cout<<res;

}