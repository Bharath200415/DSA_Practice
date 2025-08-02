//https://leetcode.com/problems/maximum-sum-of-an-hourglass/description/

#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;



class Solution {
public:
    int maxSum(vector<vector<int>>& grid) {
        int n = grid.size(), k =grid[0].size();
        int res = INT_MIN;
        int sum=0;
        
        for (int i=0; i<n-2;i++){
            for (int j=0;j<k-2;j++){
                sum = grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                res =max(sum,res);
            }
        }
        return res;
        
    }
};

int main(){
    Solution a;
    vector<vector<int>> grid1 = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
    int result = a.maxSum(grid1);
    cout<<result;

}