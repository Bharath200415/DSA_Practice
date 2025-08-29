#include <vector>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<int>  swapArr(vector<int> &arr1,int block){
    int length = arr1.size();
    vector<int> res = {};

    for (int i=(length-block);i<length;i++){
        res.push_back(arr1[i]);

    }
    for (int j = 0;j<(length-block);j++){
        res.push_back(arr1[j]);
    }
    return res;


}

int main(){
    vector<int> arr = {16,17,18,19};
    vector<int> result= swapArr(arr,2);
    for (int num : result){
        cout<<num<<" ";
    }


}