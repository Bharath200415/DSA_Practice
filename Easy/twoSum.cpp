#include <bits/stdc++.h>

using namespace std; 

class Solution{
    public:
    vector<int> twoSumResult(vector<int>& nums, int target){
        int length= nums.size();
        for (int i=0;i<length;i++){
            for (int j=1;j<length;j++){
                if (nums[i]+nums[j]==target){
                    return {i,j};
                }

            }
        }
        return {};
    }

};

int main(){
    vector<int> arr = {2,3,4,7};
    int t = 9;
    Solution a;
    vector<int> result = a.twoSumResult(arr,t);
    for (int num:result){
        cout<<num<<" ";
    }
    

}